import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Add Jtext area and Jbutton and add code to report in the GUI

public class CreatureGUI extends JFrame implements ActionListener { 
    private JLabel ageLabel;    //the Age label
    private JTextField ageText;    //the Age text box
    private JLabel weightLabel;    //the name label
    private JTextField weightText;    //the name text box
    private JLabel heightLabel;  //the height label
    private JTextField heightText;//the height text box
    
    private JButton saveInformation; //save button 
    private JButton accessFunction; //access function button
    private JButton updateInformation; //update button
    private JButton findCreature;	//find creature button
    private JButton convertInformation; //convert button
    private JButton reportInformation; //Report Button
    private JTextArea reportDisplay; //Report Information 
    
    private JLabel weightConvertLabel; //weight label for conversion function
    private JLabel heightConvertLabel;	//height label for conversion function
    private JTextArea conversionDisplay; //display box for conversion function

    private JComboBox creatureList; //drop down list for creatures
    private JComboBox functionList; //drop down list for functions
    private JComboBox weightConversionList; //drop down list for weight conversions
    private JComboBox heightConversionList; //drop down list for height conversions
    
    private Creature Wyrm; // Wyrm variable
    private Creature Inugami; 
    private Creature Bakekujira;
    private Creature Yatagarasu;
    private Creature Echeneis;
     
    

    /* the constructor method */
    public CreatureGUI () {
        setTitle("Creature GUI program"); //GUI title
        setDefaultCloseOperation(EXIT_ON_CLOSE); //GUI exit
        setSize(275, 400); //GUI size
        setLayout(new FlowLayout()); 
        
        //initialize the GUI components
        String[] functions = { "Function", "Enter", "Modify", "Convert", "Report" }; //drop down list for functions
        functionList = new JComboBox(functions); //new list
        accessFunction = new JButton("Access Function"); //new button
        functionList.setVisible(true); //can see
        accessFunction.setVisible(true); //can see
        
        String[] creatures = { "Creature", "Wyrm", "Inugami", "Bakekujira", "Yatagarasu", "Echeneis" };
        creatureList = new JComboBox(creatures); 
        creatureList.setVisible(false);
        
        String[] weight_conversions = {"Weight Conversions", "Pounds", "kg", "ounces", "tons"};
        weightConversionList = new JComboBox(weight_conversions);
        weightConversionList.setVisible(false);

        String[] height_conversions = {"Height Conversions", "Feet", "Inches", "centimeters", "meters"};
        heightConversionList = new JComboBox(height_conversions);
        heightConversionList.setVisible(false);
      
	    ageLabel = new JLabel("Enter the Age (years): "); // new label
	    ageLabel.setVisible(false); //Can't see
	    ageText = new JTextField(10); // new textField
	    ageText.setVisible(false);
        weightLabel = new JLabel("Enter the Weight (Pounds): "); 
        weightLabel.setVisible(false);
        weightText = new JTextField(10); 
        weightText.setVisible(false);
        heightLabel = new JLabel("Enter the Height (Feet): "); 
        heightLabel.setVisible(false);
        heightText = new JTextField(10); 
        heightText.setVisible(false);
        saveInformation = new JButton("Save information");
        saveInformation.setVisible(false);
        updateInformation = new JButton("Update Information");
        updateInformation.setVisible(false);
        findCreature = new JButton("Find Creature");
        findCreature.setVisible(false); 
        weightConvertLabel = new JLabel("Weight in Pounds: ");
        weightConvertLabel.setVisible(false);
        heightConvertLabel = new JLabel("Height in Feet: ");
        heightConvertLabel.setVisible(false);
        conversionDisplay = new JTextArea(5,20); 
        conversionDisplay.setVisible(false);
        convertInformation = new JButton("Convert Information"); 
        convertInformation.setVisible(false);
        reportInformation = new JButton("Report Information");
        reportInformation.setVisible(false);
        reportDisplay = new JTextArea(5,10);
        reportDisplay.setVisible(false);
        
        //order of location on GUI
        add(functionList); 
        add(accessFunction); 
     	add(creatureList);
     	add(findCreature); 
        add(ageLabel);
        add(ageText);
        add(weightLabel);
        add(weightConvertLabel);
        add(weightText);
        add(weightConversionList);
        add(heightConvertLabel);
        add(heightLabel); 
        add(heightText);
        add(heightConversionList);
        add(convertInformation);
        add(conversionDisplay);
        add(saveInformation);
        add(updateInformation);
        add(reportInformation);
        add(reportDisplay);
         setVisible(true); //make the form visible
        
        
        saveInformation.addActionListener(this); //register event handler of "Save" button
        updateInformation.addActionListener(this); 
        accessFunction.addActionListener(this); 
        findCreature.addActionListener(this);
        convertInformation.addActionListener(this);
        reportInformation.addActionListener(this);
    }

    /* the main method */
    public static void main ( String args [] ) {
        new CreatureGUI(); 
    }

    /* handle user click events */
    @Override
    public void actionPerformed(ActionEvent e) {
        //Implement the event when user click on the Report button
        //Check if "Report" button was clicked   
    	
    	
    	if (e.getSource() == accessFunction) {  //if Access function button is pressed
    		int function = functionList.getSelectedIndex(); //get selected drop down option
    		functionList.setVisible(true);
        	accessFunction.setVisible(true); 	 
        	
        	if (function == 1) { //Enter function 
        		creatureList.setVisible(true);
        		findCreature.setVisible(true);
        		ageLabel.setVisible(true); 
        		ageText.setVisible(true);
        		weightLabel.setVisible(true);
        		weightText.setVisible(true); 
        		heightText.setVisible(true);
        		heightLabel.setVisible(true);
        		saveInformation.setVisible(true);
        		updateInformation.setVisible(false);
        		weightConvertLabel.setVisible(false);
        		heightConvertLabel.setVisible(false);
        		conversionDisplay.setVisible(false);
        		convertInformation.setVisible(false); 
        		weightConversionList.setVisible(false);
        		heightConversionList.setVisible(false);
        		reportDisplay.setVisible(false);
        		reportInformation.setVisible(false);
        		
        	}
        	else if (function == 2) { //modify function
        		creatureList.setVisible(true);
        		findCreature.setVisible(true);
        		ageLabel.setVisible(true); 
        		ageText.setVisible(true);	
        		weightLabel.setVisible(true);
        		weightText.setVisible(true); 
        		heightText.setVisible(true);
        		heightLabel.setVisible(true);
        		saveInformation.setVisible(false);
        		updateInformation.setVisible(true); 
        		weightConvertLabel.setVisible(false);
        		heightConvertLabel.setVisible(false);
        		conversionDisplay.setVisible(false);
        		convertInformation.setVisible(false); 
        		weightConversionList.setVisible(false);
        		heightConversionList.setVisible(false);
        		reportDisplay.setVisible(false);
        		reportInformation.setVisible(false);
        	}
        	else if (function == 3) { //convert function
        		creatureList.setVisible(true);
        		findCreature.setVisible(true);
        		ageLabel.setVisible(false); 
        		ageText.setVisible(false);	
        		weightLabel.setVisible(false);
        		weightText.setVisible(true); 
        		heightText.setVisible(true);
        		heightLabel.setVisible(false);
        		saveInformation.setVisible(false);
        		updateInformation.setVisible(false);
        		weightConvertLabel.setVisible(true);
        		heightConvertLabel.setVisible(true);
        		conversionDisplay.setVisible(true);
        		convertInformation.setVisible(true); 
        		weightConversionList.setVisible(true);
        		heightConversionList.setVisible(true);
        		reportDisplay.setVisible(false);
        		reportInformation.setVisible(false);
        	}
        	else if (function == 4) { //report function
        		creatureList.setVisible(true);
        		findCreature.setVisible(true);
        		ageLabel.setVisible(false); 
        		ageText.setVisible(false);	
        		weightLabel.setVisible(false);
        		weightText.setVisible(false); 
        		heightText.setVisible(false);
        		heightLabel.setVisible(false);
    			saveInformation.setVisible(false);
    			updateInformation.setVisible(false);
    			weightConvertLabel.setVisible(false);
    			heightConvertLabel.setVisible(false);
    			conversionDisplay.setVisible(false);
    			convertInformation.setVisible(false); 
    			weightConversionList.setVisible(false);
    			heightConversionList.setVisible(false);
    			reportDisplay.setVisible(true);
    			reportInformation.setVisible(true);
        	
        	}
    	}
    	int creature = creatureList.getSelectedIndex();
    	String age = ageText.getText();  //set age text to string age	
		int Age = Integer.parseInt(age); //set string age to integer Age
		String weight = weightText.getText(); 
		double Weight = Double.parseDouble(weight);
		String height = heightText.getText(); 
		double Height = Double.parseDouble(height);
		int weightConversion = weightConversionList.getSelectedIndex(); 
		int heightConversion = heightConversionList.getSelectedIndex(); 
		
    	if(e.getSource() == saveInformation) {
			if (creature == 1) { 
				Wyrm = new Creature("Wyrm"); //set creature to Wrym
				Wyrm.setAge(Age); 
				Wyrm.setWeight(Weight);
				Wyrm.setHeight(Height);
			}
			if (creature == 2) {
				Inugami = new Creature("Inugami"); 
				Inugami.setAge(Age);
				Inugami.setWeight(Weight);
				Inugami.setHeight(Height);
			}
			if (creature == 3) {
				Bakekujira = new Creature("Bakekujira"); 
				Bakekujira.setAge(Age);	
				Bakekujira.setWeight(Weight);
				Bakekujira.setHeight(Height);
			}
			if (creature == 4) {
				Yatagarasu = new Creature("Yatagarasu"); 
				Yatagarasu.setAge(Age);	
				Yatagarasu.setWeight(Weight);
				Yatagarasu.setHeight(Height);
			}
			if (creature == 5) {
				Echeneis = new Creature("Echeneis"); 
				Echeneis.setAge(Age);	
				Echeneis.setWeight(Weight);
				Echeneis.setHeight(Height);
			}
    	}	
			if (e.getSource() == findCreature) {
				if (creature == 1) {
       			 	ageText.setText(Integer.toString(Wyrm.getAge())); //Show Wrym age
       			 	weightText.setText(Double.toString(Wyrm.getWeight()));
       			 	heightText.setText(Double.toString(Wyrm.getHeight()));
       			 }
				if (creature == 2) { 	 
       			 	ageText.setText(Integer.toString(Inugami.getAge()));
       			 	weightText.setText(Double.toString(Inugami.getWeight()));
       			 	heightText.setText(Double.toString(Inugami.getHeight()));
       		 	} 
				if (creature == 3) {
	       			 ageText.setText(Integer.toString(Bakekujira.getAge()));
	       			 weightText.setText(Double.toString(Bakekujira.getWeight()));
	       			 heightText.setText(Double.toString(Bakekujira.getHeight()));
				}
				if (creature == 4) {
	       			 ageText.setText(Integer.toString(Yatagarasu.getAge()));
	       			 weightText.setText(Double.toString(Yatagarasu.getWeight()));
	       			 heightText.setText(Double.toString(Yatagarasu.getHeight()));
				}
				if (creature == 5) {
	       			 ageText.setText(Integer.toString(Echeneis.getAge()));
	       			 weightText.setText(Double.toString(Echeneis.getWeight()));
	       			 heightText.setText(Double.toString(Echeneis.getHeight()));
				}
				
			}
			
			if (e.getSource() == updateInformation) {
				if (creature == 1) {
					Wyrm.setAge(Age); //change age to integer for modifying
					ageText.setText(Integer.toString(Wyrm.getAge())); //change age and set back to string for display 
					Wyrm.setWeight(Weight);
					weightText.setText(Double.toString(Wyrm.getWeight()));
					Wyrm.setHeight(Height);
					heightText.setText(Double.toString(Wyrm.getHeight()));
				}
				if (creature == 2) {
					Inugami.setAge(Age);
					ageText.setText(Integer.toString(Inugami.getAge()));
					Inugami.setWeight(Weight);
					weightText.setText(Double.toString(Inugami.getWeight()));
					Inugami.setHeight(Height);
					heightText.setText(Double.toString(Inugami.getHeight()));
				}
				if (creature == 3) {
					Bakekujira.setAge(Age);
					ageText.setText(Integer.toString(Bakekujira.getAge()));
					Bakekujira.setWeight(Weight);
					weightText.setText(Double.toString(Bakekujira.getWeight()));
					Bakekujira.setHeight(Height);
					heightText.setText(Double.toString(Bakekujira.getHeight()));
				}
				if (creature == 4) {
					Yatagarasu.setAge(Age);
					ageText.setText(Integer.toString(Yatagarasu.getAge()));
					Yatagarasu.setWeight(Weight);
					weightText.setText(Double.toString(Yatagarasu.getWeight()));
					Yatagarasu.setHeight(Height);
					heightText.setText(Double.toString(Yatagarasu.getHeight()));
				}
				if (creature == 5) {
					Echeneis.setAge(Age);
					ageText.setText(Integer.toString(Echeneis.getAge()));
					Echeneis.setWeight(Weight);
					weightText.setText(Double.toString(Echeneis.getWeight()));
					Echeneis.setHeight(Height);
					heightText.setText(Double.toString(Echeneis.getHeight()));
				}
				
			}
			if (e.getSource() == convertInformation) {
				conversionDisplay.setText("");
				if(weightConversion == 1) { //convert and display 
					double pounds = UnitConverter2.poundsToPounds(Weight);
	                conversionDisplay.append(Weight + " pounds is " + 
	                	String.format("%.2f", pounds) + " pounds" + "\n"); 
				}
				if(weightConversion == 2) {
					double kg = UnitConverter2.poundsToKg(Weight);
	                conversionDisplay.append(Weight + " pounds is " + 
	                	String.format("%.2f", kg) + " kg" + "\n"); 
				}
				if(weightConversion == 3) {
					double oz = UnitConverter2.poundsToOunces(Weight);
	                conversionDisplay.append(Weight + " pounds is " + 
	                	String.format("%.2f", oz) + " ounces" + "\n"); 
				}
				if(weightConversion == 4) {
					double tons = UnitConverter2.poundsToTons(Weight); 
	                conversionDisplay.append(Weight + " pounds is " + 
	                	String.format("%.2f", tons) + " tons" + "\n"); 
				}
				if(heightConversion == 1) {
					double feet = UnitConverter2.feetToFeet(Height);
	                conversionDisplay.append(Height + " feet is " + 
	                	String.format("%.2f", feet) + " feet" + "\n"); 
				}
				if(heightConversion == 2) {
					double inches = UnitConverter2.feetToInches(Height);
	                conversionDisplay.append(Height + " feet is " + 
	                	String.format("%.2f", inches ) + " inches" + "\n"); 
				}
				if(heightConversion == 3) {
					double cm = UnitConverter2.feetToCentimeters(Height);
	                conversionDisplay.append(Height + " feet is " + 
	                	String.format("%.2f", cm) + " cm" + "\n"); 
				}
				if(heightConversion == 4) {
					double m = UnitConverter2.feetToMeters(Height); 
	                conversionDisplay.append(Height + " feet is " + 
	                	String.format("%.2f", m) + " meters" + "\n"); 
				}
			}
			if(e.getSource() == reportInformation) {
				reportDisplay.setText("");
				if (creature == 1) {
				reportDisplay.append("Wrym is " + age + " years old" + "\n");
				
				double pounds = UnitConverter2.poundsToPounds(Weight);
				reportDisplay.append(" Wrym is " + 
	                	String.format("%.2f", pounds) + " pounds" + "\n"); 
				
				double feet = UnitConverter2.feetToFeet(Height);
                reportDisplay.append(" Wrym is " + 
                	String.format("%.2f", feet) + " feet" + "\n"); 
                
				}
				if (creature == 2) {
					reportDisplay.append("Inugami is " + age + " years old" + "\n");
					
					double pounds = UnitConverter2.poundsToPounds(Weight);
					reportDisplay.append(" Inugami is " + 
		                	String.format("%.2f", pounds) + " pounds" + "\n"); 
					
					double feet = UnitConverter2.feetToFeet(Height);
	                reportDisplay.append(" Inugami is " + 
	                	String.format("%.2f", feet) + " feet" + "\n");
	                
					
			}
    
			if (creature == 3) {
				reportDisplay.append("Bakekujira is " + age + " years old" + "\n");
				
				double pounds = UnitConverter2.poundsToPounds(Weight);
				reportDisplay.append(Weight + " Bakekujira is " + 
	                	String.format("%.2f", pounds) + " pounds" + "\n"); 
				
				double feet = UnitConverter2.feetToFeet(Height);
                reportDisplay.append(Height + " Bakekujira is " + 
                	String.format("%.2f", feet) + " feet" + "\n"); 
                
                
				}
			if (creature == 4) {
				reportDisplay.append("Yatagarasu is " + age + " years old" + "\n");
				
					double pounds = UnitConverter2.poundsToPounds(Weight);
					reportDisplay.append(Weight + " Yatagarasu is " + 
		                	String.format("%.2f", pounds) + " pounds" + "\n"); 
					
					double feet = UnitConverter2.feetToFeet(Height);
	                reportDisplay.append(Height + " Yatagarasu is " + 
	                	String.format("%.2f", feet) + " feet" + "\n"); 
	                
	               
					}
				if (creature == 5) {
				reportDisplay.append("Echenies is " + age + " years old" + "\n");
				
					double pounds = UnitConverter2.poundsToPounds(Weight);
					reportDisplay.append(Weight + " Echenies is " + 
		                	String.format("%.2f", pounds) + " pounds" + "\n"); 
					
					double feet = UnitConverter2.feetToFeet(Height);
	                reportDisplay.append(Height + " Echenies is " + 
	                	String.format("%.2f", feet) + " feet" + "\n"); 
				}
	                
	                
					}
				}
}

 
 