package Aufgabe1;

public class TestDrucker {
	public static void main(String[] args) {
		LaserDrucker laser1 = new LaserDrucker();
		PDFDrucker pdf = new PDFDrucker();
		LaserDrucker laser2 = new LaserDrucker();

		laser1.testAusdruck();
		pdf.testAusdruck();
		laser2.testAusdruck();
		
		laser1.drucken("Hallo, dies ist mein Text fuer Laser 1!");
		pdf.drucken("Hallo, dies ist mein Text fuer den PDF-Drucker!");
		laser2.drucken("Hallo, dies ist mein Text fuer Laser 2!");
	}
}
