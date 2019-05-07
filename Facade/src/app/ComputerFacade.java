package app;

import java.io.IOException;

public class ComputerFacade {
	
	private static final long BOOT_SECTOR = 1024;
	private static final long BOOT_ADDRESS = 0xbfc00000;
	private static final int SECTOR_SIZE = 512;
	private final CPU cpu;
	private final Memory ram;
	private final HardDrive hdd;
	
	

	public ComputerFacade() {
		this.cpu = new CPU();
		this.ram = new Memory();
		this.hdd = new HardDrive();
	}



	public void start() throws IOException {
		cpu.freeze();
		ram.load(BOOT_ADDRESS, hdd.read(BOOT_SECTOR,  SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.excecute();
		
	}

}
