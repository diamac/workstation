import javax.swing.JOptionPane;

public class firsttest {

	public static void main(String[] args){

		String pro= JOptionPane.showInputDialog(null,"Wie oft soll gerechnet werden?");
		
			if (pro == null){
				JOptionPane.showMessageDialog(null,"Programm wird beendet");
					System.exit(0);
			}
			//pro.length()<=0 zeichenlänge überprüfen
				if ( pro.equals("0")){
					JOptionPane.showMessageDialog(null,"Programm wird beendet");
					System.exit(0);}
			
				else {
	
				int zaehler = Integer.parseInt(pro);
				
				int x= 0;
				
				int y= 0;
		
				//marc.reis.79@gmail.com
		
				JOptionPane.showMessageDialog(null,"Hallo zum Rechner");
		
				
		
				JOptionPane.showMessageDialog(null,"Closed Beta 0.1");
				
				while (zaehler>x) {
					
					if(y>=3) {y= 0;}
					
					x++;
					
					
						double [] mrx = new double[3];
						
							String operator= JOptionPane.showInputDialog(null,"geb deinen Operator ein");
			
							if (operator == null) {
								JOptionPane.showMessageDialog(null,"Fehler bei der Bearbeitung der Daten.\nProgramm wird beendet");
								break;}
							
				
								String zahleins= JOptionPane.showInputDialog(null,"gib deine 1. Zahl ein");
									if (zahleins == null){
										JOptionPane.showMessageDialog(null,"Fehler bei der Bearbeitung der Daten.\nProgramm wird beendet");
										break;}
				
								String zahlzwei= JOptionPane.showInputDialog(null,"gib deine 2. Zahl ein");
									if (zahlzwei == null) {
										JOptionPane.showMessageDialog(null,"Fehler bei der Bearbeitung der Daten.\nProgramm wird beendet");
										break;}
			
		
						double zahlone = Integer.parseInt(zahleins);
						double zahltwo = Integer.parseInt(zahlzwei);
						double result = 0;					
								
						
						switch (operator){
						
								
									
						
								case "+":
									 result = zahlone + zahltwo;
									break;
								
								case "-":
									 result = zahlone - zahltwo;
									break;
								
								case "*":
									 result = zahlone * zahltwo;
									break;
									
								case "/":
									result = zahlone / zahltwo;
									break;
								
								default:
									JOptionPane.showMessageDialog (null,"kein Operator gegeben!");
								
								}
								
								mrx[y] = result;
								y++;
								for(double d : mrx){
									System.out.println("" + d);
								}
								
								
								JOptionPane.showMessageDialog(null,"Das Ergebnis ist " + result);
								
									
			
				}
				}		
		}
}
