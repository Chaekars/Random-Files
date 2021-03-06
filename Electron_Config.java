import java.io.*;
import java.util.*;
public class Electron_Config 
{
public static void main(String args[]) throws IOException
{	
	
	String[][] c = 
		   {{"H", "He"},
			{"Li","Be","B", "C", "N", "O", "F", "Ne"},
			{"Na","Mg", "Al", "Si", "P", "S", "Cl", "Ar"},
			{"K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr"},
			{"Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe"},
			{"Cs", "Ba", "La", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn"},
			{"Fr", "Ra", "Ac", "Db", "Sg", "Bh", "Hs", "Mt", "Uun", "Uuu", "Uub", "Uuq"},
			{"Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu"},
			{"Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr"}};
	
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter your Symbol:");
	String a = input.nextLine();
	System.out.print("\nIs this an appropriate Symbol length?: ");
	if (a.length() == 2 || a.length() == 3 || a.length() == 1)
	{
		System.out.print("\nYes");
		System.out.println("\nIs it an actual Symbol?: ");
        int l = 0;
        int w = 0;
        boolean found = false;    

		     for ( l = 0; l < c.length; l++)
		       {
		    	 for( w = 0; w < c[l].length; w++)
		    	   {
		             if (a.equalsIgnoreCase(c[l][w]))
			             {
	                      found = true;      
	                      break;
	              		 }
    	   		   }
       	       }

       		if (found)  
       		{
       			System.out.print("Yes\n");

       			if(a.equalsIgnoreCase("Cu"))
       			{
       				System.out.print("\n");
       				System.out.println("Copper");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(1)3d(10)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Cr"))
       			{
       				System.out.print("\n");
       				System.out.println("Chromium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(1)3d(5)");
       			return;
       			}if(a.equalsIgnoreCase("H"))
       			{
       				System.out.print("\n");
       				System.out.println("Hydrogen");
       			System.out.print("1s(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("He"))
       			{
       				System.out.print("\n");
   					System.out.println("Helium");
       			System.out.print("1s(2)");
       			return;
       			}if(a.equalsIgnoreCase("Li"))
       			{
       				System.out.print("\n");
       				System.out.println("Lithium");
       			System.out.print("1s(2)2s(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Be"))
       			{
       				System.out.print("\n");
       				System.out.println("Beryllium");
       			System.out.print("1s(2)2s(2)");
       			return;
       			}if(a.equalsIgnoreCase("B"))
       			{
       				System.out.print("\n");
       				System.out.println("Boron");
       			System.out.print("1s(2)2s(2)2p(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("C"))
       			{
       				System.out.print("\n");
       				System.out.println("Carbon");
       			System.out.print("1s(2)2s(2)2p(2)");
       			return;
       			}if(a.equalsIgnoreCase("N"))
       			{
       				System.out.print("\n");
       				System.out.println("Nitrogen");
       			System.out.print("1s(2)2s(2)2p(3)");
       			return;
       			}
       		if(a.equalsIgnoreCase("O"))
       			{
       				System.out.print("\n");
       				System.out.println("Oxygen");
       			System.out.print("1s(2)2s(2)2p(4)");
       			return;
       			}if(a.equalsIgnoreCase("F"))
       			{
       				System.out.print("\n");
       				System.out.println("Flourine");
       			System.out.print("1s(2)2s(2)2p(5)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Ne"))
       			{
       				System.out.print("\n");
       				System.out.println("Neon");
       			System.out.print("1s(2)2s(2)2p(6)");
       			return;
       			}if(a.equalsIgnoreCase("Na"))
       			{
       				System.out.print("\n");
       				System.out.println("Sodium");
       			System.out.print("1s(2)2s(2)2p(6)3s(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Mg"))
       			{
       				System.out.print("\n");
       				System.out.println("Magnesium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)");
       			return;
       			}if(a.equalsIgnoreCase("Al"))
       			{
       				System.out.print("\n");
       				System.out.println("Aluminium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Si"))
       			{
       				System.out.print("\n");
       				System.out.println("Silicon");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(2)");
       			return;
       			}if(a.equalsIgnoreCase("P"))
       			{
       				System.out.print("\n");
       				System.out.println("Phosphorus");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(3)");
       			return;
       			}
       		if(a.equalsIgnoreCase("S"))
       			{
       				System.out.print("\n");
       				System.out.println("Sulfur");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(4)");
       			return;
       			}if(a.equalsIgnoreCase("Cl"))
       			{
       				System.out.print("\n");
       				System.out.println("Chlorine");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(5)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Ar"))
       			{
       				System.out.print("\n");
       				System.out.println("Argon");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)");
       			return;
       			}if(a.equalsIgnoreCase("K"))
       			{
       				System.out.print("\n");
       				System.out.println("Potassium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Ca"))
       			{
       				System.out.print("\n");
       				System.out.println("Calcium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)");
       			return;
       			}if(a.equalsIgnoreCase("Sc"))
       			{
       				System.out.print("\n");
       				System.out.println("Scandium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Ti"))
       			{
       				System.out.print("\n");
       				System.out.println("Titanium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(2)");
       			return;
       			}if(a.equalsIgnoreCase("V"))
       			{
       				System.out.print("\n");
       				System.out.println("Vanadium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(3)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Mn"))
       			{
       				System.out.print("\n");
       				System.out.println("Manganese");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(5)");
       			return;
       			}if(a.equalsIgnoreCase("Fe"))
       			{
       				System.out.print("\n");
       				System.out.println("Iron");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(6)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Co"))
       			{
       				System.out.print("\n");
       				System.out.println("Cobalt");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(7)");
       			return;
       			}if(a.equalsIgnoreCase("Ni"))
       			{
       				System.out.print("\n");
       				System.out.println("Nickel");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(8)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Zn"))
       			{
       				System.out.print("\n");
       				System.out.println("Zinc");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)");
       			return;
       			}if(a.equalsIgnoreCase("Ga"))
       			{
       				System.out.print("\n");
       				System.out.println("Gallium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Ge"))
       			{
       				System.out.print("\n");
       				System.out.println("Germanium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(2)");
       			return;
       			}if(a.equalsIgnoreCase("As"))
       			{
       				System.out.print("\n");
       				System.out.println("Arsenic");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(3)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Se"))
       			{
       				System.out.print("\n");
       				System.out.println("Selenium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(4)");
       			return;
       			}if(a.equalsIgnoreCase("Br"))
       			{
       				System.out.print("\n");
       				System.out.println("Bromine");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(5)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Kr"))
       			{
       				System.out.print("\n");
       				System.out.println("Krypton");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)");
       			return;
       			}if(a.equalsIgnoreCase("Rb"))
       			{
       				System.out.print("\n");
       				System.out.println("Rubidium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Sr"))
       			{
       				System.out.print("\n");
       				System.out.println("Strontium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)");
       			return;
       			}if(a.equalsIgnoreCase("Y"))
       			{
       				System.out.print("\n");
       				System.out.println("Yttrium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(1)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Zr"))
       			{
       				System.out.print("\n");
       				System.out.println("Zirconium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(2)");
       			return;
       			}if(a.equalsIgnoreCase("Nb"))
       			{
       				System.out.print("\n");
       				System.out.println("Niobium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(3)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Mo"))
       			{
       				System.out.print("\n");
       				System.out.println("Molybdenum");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(4)");
       			return;
       			}if(a.equalsIgnoreCase("Tc"))
       			{
       				System.out.print("\n");
       				System.out.println("Technetium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(5)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Ru"))
       			{
       				System.out.print("\n");
       				System.out.println("Ruthenium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(6)");
       			return;
       			}if(a.equalsIgnoreCase("Rh"))
       			{
       				System.out.print("\n");
       				System.out.println("Rhodium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(7)");
       			return;
       			}
       		if(a.equalsIgnoreCase("Pd"))
       			{
       				System.out.print("\n");
       				System.out.println("Palladium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(8)");
       			return;
       			}if(a.equalsIgnoreCase("Ag"))
       			{
       				System.out.print("\n");
       				System.out.println("Silver");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(9)");
       			return;
       			}
       			if(a.equalsIgnoreCase("Cd"))
       			{
       				System.out.print("\n");
       				System.out.println("Cadmium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)");
       			return;
       			}if(a.equalsIgnoreCase("In"))
       			{
       				System.out.print("\n");
       				System.out.println("Indium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(1)");
       			return;
       			}if(a.equalsIgnoreCase("Sn"))
       			{
       				System.out.print("\n");
       				System.out.println("Tin");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(2)");
       			return;
       			}if(a.equalsIgnoreCase("Sb"))
       			{
       				System.out.print("\n");
       				System.out.println("Antimony");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(3)");
       			return;
       			}if(a.equalsIgnoreCase("Te"))
       			{
       				System.out.print("\n");
       				System.out.println("Tellurium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(4)");
       			return;
       			}if(a.equalsIgnoreCase("I"))
       			{
       				System.out.print("\n");
       				System.out.println("Iodine");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(5)");
       			return;
       			}if(a.equalsIgnoreCase("Xe"))
       			{
       				System.out.print("\n");
       				System.out.println("Xenon");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)");
       			return;
       			}if(a.equalsIgnoreCase("Cs"))
       			{
       				System.out.print("\n");
       				System.out.println("Caesium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(1)");
       			return;
       			}if(a.equalsIgnoreCase("Ba"))
       			{
       				System.out.print("\n");
       				System.out.println("Barium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)");
       			return;
       			}if(a.equalsIgnoreCase("La"))
       			{
       				System.out.print("\n");
       				System.out.println("Lanthanum");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)5d(1)");
       			return;
       			}if(a.equalsIgnoreCase("Hf"))
       			{
       				System.out.print("\n");
       				System.out.println("Hafnium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(2)");
       			return;
       			}if(a.equalsIgnoreCase("Ta"))
       			{
       				System.out.print("\n");
       				System.out.println("Tantalum");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(3)");
       			return;
       			}if(a.equalsIgnoreCase("W"))
       			{
       				System.out.print("\n");
       				System.out.println("Tungsten");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(4)");
       			return;
       			}if(a.equalsIgnoreCase("Re"))
       			{
       				System.out.print("\n");
       				System.out.println("Rhenium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(5)");
       			return;
       			}if(a.equalsIgnoreCase("Os"))
       			{
       				System.out.print("\n");
       				System.out.println("Osmium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(6)");
       			return;
       			}if(a.equalsIgnoreCase("Ir"))
       			{
       				System.out.print("\n");
       				System.out.println("Iridium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(7)");
       			return;
       			}if(a.equalsIgnoreCase("Pt"))
       			{
       				System.out.print("\n");
       				System.out.println("Platinum");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(8)");
       			return;
       			}if(a.equalsIgnoreCase("Au"))
       			{
       				System.out.print("\n");
       				System.out.println("Gold");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(9)");
       			return;
       			}
       			if(a.equalsIgnoreCase("Hg"))
       			{
       				System.out.print("\n");
       				System.out.println("Mercury");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)");
       			return;
       			}if(a.equalsIgnoreCase("Tl"))
       			{
       				System.out.print("\n");
       				System.out.println("Thallium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(1)");
       			return;
       			}if(a.equalsIgnoreCase("Pb"))
       			{
       				System.out.print("\n");
       				System.out.println("Lead");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(2)");
       			return;
       			}if(a.equalsIgnoreCase("Bi"))
       			{
       				System.out.print("\n");
       				System.out.println("Bismuth");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(3)");
       			return;
       			}if(a.equalsIgnoreCase("Po"))
       			{
       				System.out.print("\n");
       				System.out.println("Polonium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(4)");
       			return;
       			}if(a.equalsIgnoreCase("At"))
       			{
       				System.out.print("\n");
       				System.out.println("Astatine");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(5)");
       			return;
       			}if(a.equalsIgnoreCase("Rn"))
       			{
       				System.out.print("\n");
       				System.out.println("Radon");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)");
       			return;
       			}if(a.equalsIgnoreCase("Fr"))
       			{
       				System.out.print("\n");
       				System.out.println("Francium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(1)");
       			return;
       			}if(a.equalsIgnoreCase("Ra"))
       			{
       				System.out.print("\n");
       				System.out.println("Radium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)");
       			return;
       			}if(a.equalsIgnoreCase("Ac"))
       			{
       				System.out.print("\n");
       				System.out.println("Actinium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)6d(1)");
       			return;
       			}if(a.equalsIgnoreCase("Rf"))
       			{
       				System.out.print("\n");
       				System.out.println("Rutherfordium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(2)");
       			return;
       			}if(a.equalsIgnoreCase("Db"))
       			{
       				System.out.print("\n");
       				System.out.println("Dubnium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(3)");
       			return;
       			}if(a.equalsIgnoreCase("Sg"))
       			{
       				System.out.print("\n");
       				System.out.println("Seaborgium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(4)");
       			return;
       			}if(a.equalsIgnoreCase("Bh"))
       			{
       				System.out.print("\n");
       				System.out.println("Bohrium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(5)");
       			return;
       			}if(a.equalsIgnoreCase("Hs"))
       			{
       				System.out.print("\n");
       				System.out.println("Hassium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(6)");
       			return;
       			}if(a.equalsIgnoreCase("Mt"))
       			{
       				System.out.print("\n");
       				System.out.println("Meitnerium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(7)");
       			return;
       			}if(a.equalsIgnoreCase("Uun"))
       			{
       				System.out.print("\n");
       				System.out.println("Ununnilium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(8)");
       			return;
       			}if(a.equalsIgnoreCase("Uuu"))
       			{
       				System.out.print("\n");
       				System.out.println("Unununium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(9)");
       			return;
       			}if(a.equalsIgnoreCase("Uub"))
       			{
       				System.out.print("\n");
       				System.out.println("Ununbium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(10)");
       			return;
       			}if(a.equalsIgnoreCase("Uuq"))
       			{
       				System.out.print("\n");
       				System.out.println("Ununquadium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)6d(10)7p(2)");
       			return;
       			}if(a.equalsIgnoreCase("Ce"))
       			{
       				System.out.print("\n");
       				System.out.println("Cerium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(1)");
       			return;
       			}if(a.equalsIgnoreCase("Pr"))
       			{
       				System.out.print("\n");
       				System.out.println("Praseodymium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(2)");
       			return;
       			}if(a.equalsIgnoreCase("Nd"))
       			{
       				System.out.print("\n");
       				System.out.println("Neodymium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(3)");
       			return;
       			}if(a.equalsIgnoreCase("Pm"))
       			{
       				System.out.print("\n");
       				System.out.println("Promethium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(4)");
       			return;
       			}if(a.equalsIgnoreCase("Sm"))
       			{
       				System.out.print("\n");
       				System.out.println("Samarium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(5)");
       			return;
       			}if(a.equalsIgnoreCase("Eu"))
       			{
       				System.out.print("\n");
       				System.out.println("Europium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(6)");
       			return;
       			}if(a.equalsIgnoreCase("Gd"))
       			{
       				System.out.print("\n");
       				System.out.println("Gadolinium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(7)");
       			return;
       			}if(a.equalsIgnoreCase("Tb"))
       			{
       				System.out.print("\n");
       				System.out.println("Terbium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(8)");
       			return;
       			}if(a.equalsIgnoreCase("Dy"))
       			{
       				System.out.print("\n");
       				System.out.println("Dysprosium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(9)");
       			return;
       			}if(a.equalsIgnoreCase("Ho"))
       			{
       				System.out.print("\n");
       				System.out.println("Holmium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(10)");
       			return;
       			}if(a.equalsIgnoreCase("Er"))
       			{
       				System.out.print("\n");
       				System.out.println("Erbium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(11)");
       			return;
       			}if(a.equalsIgnoreCase("Tm"))
       			{
       				System.out.print("\n");
       				System.out.println("Thulium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(12)");
       			return;
       			}if(a.equalsIgnoreCase("Yb"))
       			{
       				System.out.print("\n");
       				System.out.println("Ytterbium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(13)");
       			return;
       			}if(a.equalsIgnoreCase("Lu"))
       			{
       				System.out.print("\n");
       				System.out.println("Lutetium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)");
       			return;
       			}if(a.equalsIgnoreCase("Th"))
       			{
       				System.out.print("\n");
       				System.out.println("Thorium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(1)");
       			return;
       			}if(a.equalsIgnoreCase("Pa"))
       			{
       				System.out.print("\n");
       				System.out.println("Protactinium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(2)");
       			return;
       			}if(a.equalsIgnoreCase("U"))
       			{
       				System.out.print("\n");
       				System.out.println("Uranium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(3)");
       			return;
       			}if(a.equalsIgnoreCase("Np"))
       			{
       				System.out.print("\n");
       				System.out.println("Neptunium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(4)");
       			return;
       			}if(a.equalsIgnoreCase("Pu"))
       			{
       				System.out.print("\n");
       				System.out.println("Plutonium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(5)");
       			return;
       			}if(a.equalsIgnoreCase("Am"))
       			{
       				System.out.print("\n");
       				System.out.println("Americium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(6)");
       			return;
       			}if(a.equalsIgnoreCase("Cm"))
       			{
       				System.out.print("\n");
       				System.out.println("Curium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(7)");
       			return;
       			}if(a.equalsIgnoreCase("Bk"))
       			{
       				System.out.print("\n");
       				System.out.println("Berklium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(8)");
       			return;
       			}if(a.equalsIgnoreCase("Cf"))
       			{
       				System.out.print("\n");
       				System.out.println("Californium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(9)");
       			return;
       			}if(a.equalsIgnoreCase("Es"))
       			{
       				System.out.print("\n");
       				System.out.println("Einsteinium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(10)");
       			return;
       			}if(a.equalsIgnoreCase("Fm"))
       			{
       				System.out.print("\n");
       				System.out.println("Fermium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(11)");
       			return;
       			}if(a.equalsIgnoreCase("Md"))
       			{
       				System.out.print("\n");
       				System.out.println("Mendelevium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(12)");
       			return;
       			}if(a.equalsIgnoreCase("No"))
       			{
       				System.out.print("\n");
       				System.out.println("Nobelium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(13)");
       			return;
       			}if(a.equalsIgnoreCase("Lr"))
       			{
       				System.out.print("\n");
       				System.out.println("Lawrencium");
       			System.out.print("1s(2)2s(2)2p(6)3s(2)3p(6)4s(2)3d(10)4p(6)5s(2)4d(10)5p(6)6s(2)4f(14)5d(10)6p(6)7s(2)5f(14)");
       			return;
       			}
       		
       		
       		}
       		else
       		{
       			System.out.println(a + " is not in this matrix.");
       		}
     }
	
	else
		System.out.print("No");
	
	
	
	
	
}
}
