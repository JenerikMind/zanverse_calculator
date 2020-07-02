import javax.swing.JOptionPane;
public class zan {
    public static void main(String[] args) {

        while(true){
            String choice = JOptionPane.showInputDialog(
                    "Type 1 for avg extra dmg for a group under zanverse \nType 2 for single player DPS"
                    );
            if(choice.equals("1")) {
                CalcSingle();
                break;
            }else if(choice.equals("2")){
                CalcDPS();
                break;
            }else {
                JOptionPane.showMessageDialog(null, "Enter a valid value.");
            }
        }
	}

	private static void CalcSingle() {
		// take in number from user
		int atk_dmg = Integer.parseInt(
				JOptionPane.showInputDialog("How much damage in the hypothetical attack?")
				);
		
		float zan_extra = atk_dmg * 0.20f;
		JOptionPane.showMessageDialog(null, "Extra atk dmg: "+ zan_extra);
		
		int num_of_atks = Integer.parseInt(
				JOptionPane.showInputDialog("How many people are in the zanverse?")
				);
		JOptionPane.showMessageDialog(null, "Extra atk dmg: "+ num_of_atks * zan_extra);
	}
	
	private static void CalcDPS() {
		int atk_per_ten = Integer.parseInt(
				JOptionPane.showInputDialog("How many atks/10 seconds?")
				);
		int avg_atk_dmg = Integer.parseInt(
				JOptionPane.showInputDialog("What is the average damage per atk?")
                );
		float dps_without = ((float)atk_per_ten / 10) * avg_atk_dmg;
		float dps_with = dps_without * 0.20f + dps_without;
		JOptionPane.showMessageDialog(
				null,
				dps_without + " is your dps without zanverse.\n" 
				+ dps_with + " is your dps with zanverse." 
				);
	}
}