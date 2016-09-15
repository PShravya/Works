package com.fii.metrics.displayversion;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;


/**
 * @author Shravya Peddiraju 
 *  This class displays the history of the five main components for the past 10 years
 */
public class VersionMetrics {

	int historyYear, noOfYears;

	String data[][];

	boolean status;		//for valid history
	
	
	/** 
	 * Initializing array instance variable
	 */
	public void setArray(String arr[][]) {

		data = arr;
	}

	
	/**
	 *Initializes the JDK array, then store these values in data array and calls the display method.  
	 */
	public void diaplayJdk() {
		
		System.out.println("JDK Version History");

		String jdk[][] = { { "JavaSE 8", "March 2014 " },
						   { "JavaSE 7", "July 28 2011 " },
						   { "JavaSE 6", "6 December 2006" } };

		setArray(jdk); // To initialie the array and pass it globally (they can be done only through setters)
		display();
	}
	

	/**
	 * Initializes the eclipse array, then store these values in data array and call the display method.
	 */
	public void displayEclipse() {
		
		System.out.println("Eclipse Version History");

		String eclipse[][] = {  { "Neon 4.6", "June 22, 2016" } , { "Mars 4.5", "June 24, 2015" },
								{ "Luna 4.4", "June 25, 2014" }, { "Kepler 4.3", "June 26, 2013" },
								{ "Juno 4.2", "June 27, 2012" }, { "Indigo 3.7", "June 22, 2011" },
								{ "Helios 3.6", "June 23, 2010" }, { "Galileo 3.5", "June 24, 2009" }, 
								{ "Ganymede 3.4", "June 25, 2008" }, { "Europa 3.3", "June 27, 2007" },
								{ "Callisto 3.2", "June 26, 2006" } };
								
		setArray(eclipse); 
		display();
	}

	
	/**
	 * Initializes the netBeans array, then store these values in data array and calls the display method.
	 */
	public void displayNetBeans() {
		
		System.out.println("NetBeans Version History");

		String netBeans[][] = { { "Net Beans 8.1", " 2015 " }, { "Net Beans 8.0", " 2014" },
								{ "Net Beans 7.2", " 2013 " }, { "Net Beans 7.0", " 2012" },
								{ "Net Beans 6.9", " 2011" }, { "Net Beans 6.8", " 2010" },
								{ "Net Beans 6.5", " 2009" }, { "Net Beans 6.0", " 2008" },
								{ "Net Beans 5.5", " 2007" }, { "Net Beans 5.0", " 2006" } };

		setArray(netBeans);
		display();

	}

	
	/**
	 * Initializes the intelliJ array, then store these values in data array and call the display method.
	 */
	public void displayIntelliJ() {
		
		System.out.println("IntelliJ Version History");

		String intelliJ[][] = { { "IntelliJ Idea 15", " 2015" }, { "IntelliJ Idea 14", " 2014" },
								{ "IntelliJ Idea 13", " 2013" }, { "IntelliJ Idea 12", " 2012" },
								{ "IntelliJ Idea 11", " 2012" }, { "IntelliJ Idea 10.5", " 2011" },
								{ "IntelliJ Idea 10", " 2010" }, { "IntelliJ Idea 8", " 	 2009" },
								{ "IntelliJ Idea 7", " 	 2008" }, { "IntelliJ Idea 7", " 	 2007" },
								{ "IntelliJ Idea 6", " 	 2006" } };

		setArray(intelliJ);
		display();
	}

	
	/**
	 * Specifies the options list and calls the related methods based on the options entered.
	 */
	public void displayIde() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the following option 1.Eclipse 2.NetBeans 3.IntelliJ");

		int option = sc.nextInt();

		if (option == 1) {
			displayEclipse();
		}

		else if (option == 2) {
			displayNetBeans();
		}

		else if (option == 3) {
			displayIntelliJ();
		}
		
		else
		{
			System.out.println("Enter option between 1 and 3 only");
		}
	}

	
	/**
	 * Initializes the Oracle array, then store these values in data array and call the display method.
	 */
	public void displayOracle() {
		
		System.out.println(" Oracle Version history");

		String oracle[][] = {{ "Oracle 12c (12.1)", "July 2014" },{ "Oracle 11g (11.2)", "August 2013" },
							 { "Oracle 12c (12.1)", "June 2013" },{ "Oracle 10g (10.2)", "April 2010" },
							 { "Oracle 11g (11.1)", "September 2008" }, { "Oracle 9i   ", "	April 2007" },
							 { "Oracle 10g (10.1)", "February 2006" }};
				 

		setArray(oracle);
		display();
	}

	
	/**
	 * Initializes the SQL array, then store these values in data array and call the display method.
	 */
	public void displaySql() {
		
		System.out.println("SqlServer Version History");

		String sql[][] = { { "SQL Server 2016", " 	2016" }, { "SQL Server 2014", " 	2014" },
						   { "SQL Server 2012", " 	2012" }, { "SQL Server 2008 R2", " 2008" },
						   { "SQL Server 2008", " 	2008" }, { "SQL Server 2005", " 	2005" } };

		setArray(sql);
		display();
	}
	

	/**
	 * Initializes the MySQL array, then store these values in data array and call the display method.
	 */
	public void displayMySql() {
		
		System.out.println("MySql Version history");

		String mySql[][] = { { "MySQL 5.7", " 	2015" }, { "MySQL 5.6", " 	2013" },
							 { "MySQL 5.5", " 	2010" }, { "MySQL 5.1", " 	2008" }, 
							 { "MySQL Beta 5.0", " 	2005" } };

		setArray(mySql);
		display();

	}

	/**
	 * Takes the user input and calls the respective method based on the option.
	 */
	public void displayDatabase() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the following option 1.Oracle 2.SqlServer 3.MySql");

		int option = sc.nextInt();

		if (option == 1) {
			displayOracle();
		}

		else if (option == 2) {
			displaySql();
		}

		else if (option == 3) {
			displayMySql();
		}

		else
			System.out.println("Enter the option only between 1 and 3");
	}

	/**
	 * Initializes the SVN array, then store these values in data array and calls the display method.
	 */
	public void displaySvn() {
		
		System.out.println("SVN version history");

		String svn[][] = { { "SVN 1.9", "		2015" }, { "SVN 1.8", "		2013" },
					 	   { "SVN 1.7", "		2011" }, { "SVN 1.6", "		2009" }, 
					 	   { "SVN 1.5", "		2008" }, { "SVN 1.4", "		2006" } };

		setArray(svn);
		display();
	}

	/**
	 * Initializes the GIT array, then store these values in data array and calls the display method.
	 */
	public void displayGit() {
		
		System.out.println("Git Version history");

		String git[][] = { { "GIT 2.9", " 			2016" }, { "GIT 2.8", " 			2016" },
						   { "GIT 2.7", " 			2016" }, { "GIT 2.6", " 			2016" }, 
						   { "GIT 2.5", " 			2016" }, { "GIT 2.4", " 			2016" }, 
						   { "GIT 2.3", "			2015" }, { "GIT 2.2", " 			2015" },
						   { "GIT 2.1", "			2014" }, { "GIT 2", " 			2014" }, 
						   { "GIT 1.9", " 			2014" }, { "GIT 1.8", " 			2014" }, 
						   { "GIT 1.7", " 			2012" }, { "GIT 1.6", " 			2010" },
						   { "GIT 1.5", " 			2008" }, { "GIT 1.4", " 			2008" }, 
						   { "GIT 1.3", " 			2006" }, { "GIT 1.2", " 			2006" }, 
						   { "GIT 1.1", " 			2006" }, { "GIT 1", " 			2006" },
						   { "GIT 0.99", " 			2005" } };

		setArray(git);
		display();

	}

		
	/**
	 *  Takes the user input and calls the respective method based on the option.
	 */
	public void displayRepository() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the following option 1.SVN 2.GIT ");

		int option = sc.nextInt();

		if (option == 1) {
			displaySvn();
		}

		else if (option == 2) {
			displayGit();
		}

		else
			System.out.println("Enter the option only between 1 and 2");
	}

	/**
	 * Initializes the tomcat array, then store these values in data array and calls the display method.
	 */
	public void displayTomcat() {
		
		System.out.println("Tomcat Version History");
		
		String tomcat[][] = {{ "Apache Tomcat9.0 alpha", "		May 2016" },{ "Apache Tomcat8.5 Beta", "		May 2016" },
							 { "Apache Tomcat8.0", "		May 2016" }, { "Apache Tomcat7.0", "		April 2016 " },
							 { "Apache Tomcat6.0", "		February 2016" }, { "Apache Tomcat5.5", "		October 2012" },
							 { "Apache Tomcat4.1", "		June 2009" } };

		setArray(tomcat);
		display();
	}

	/**
	 * Initializes the weblogic array, then store these values in data array and calls the display method.
	 */
	public void displayWebLogic() {
		
		System.out.println("Weblogic version History");

		String webLogic[][] = { { "WebLogic  12c R2 (12.2.1)", " 	October 26, 2015" },
							 	{ "WebLogic  12c R3 (12.1.3)", " 	June 26, 2014" },
							 	{ "WebLogic  12c R2 (12.1.2)", "	July 11, 2013" }, 
							 	{ "WebLogic  12c R1 (12.1.1)", " 	Dec 1, 2012" },
							 	{ "WebLogic  11gR1 PS5 (10.3.6)", "	February 26, 2012" },
							 	{ "WebLogic  11gR1 PS4 (10.3.5)", "	May 16, 2011" },
							 	{ "WebLogic  11gR1 PS3 (10.3.4)", "	January 15, 2011" },
							 	{ "WebLogic  11gR1 PS2 (10.3.3)", " 	April 2010" },
							 	{ "WebLogic  11gR1 PS1 (10.3.2) ", "	November 2009" },
							 	{ "WebLogic  11g (10.3.1)", "		July 2009" }, 
							 	{ "WebLogic  10.3", "			August 2008" },
							 	{ "WebLogic  10.0", "			March 2007" }, 
							 	{ "WebLogic  9.0 ", "			November 2006" } };

		setArray(webLogic);
		display();

	}

	/**
	 * Initializes the glassFish array, then store these values in data array and calls the display method.
	 */
	public void displayGlassFish() {
		
		System.out.println("GlassFish Version History");

		String glassFish[][] = {{ "GlassFish 4.1", "			September 2014" }, 
								{ "GlassFish 4.0", "			June 2013" },
								{ "GlassFish v3.1.2.2", "		July 2012" },
								{ "GlassFish v3.1.2", "		February 2012" },
								{ "GlassFish v3.1", "			February 2011" },
								{ "GlassFish v3.1.1", "		July 2011" },
								{ "GlassFish v3", "			December 2009" },
								{ "GlassFish 2.1", "			January 2009" },
								{ "GlassFish1", "			September 2007" }, 
								{ "GlassFish1", "			8 May 2007" }};

		setArray(glassFish);
		display();

	}

	/**
	 * Takes the user input and calls the respective method based on the option.
	 */
	public void displayApplicationServer() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the following option 1.TOMCAT 2.WEBLOGIC 3.GLASSFISH");

		int option = sc.nextInt();

		if (option == 1) {
			displayTomcat();
		}

		else if (option == 2) {
			displayWebLogic();
		}

		else if (option == 3) {
			displayGlassFish();
		}

		else
			System.out.println("Enter the option only between 1 and 3");
	}

	/**
	 * Calculates the historyYear, till which year the data should be displayed.
	 */
	public void setHistoryYear() {

		System.out.println(" How many years of history do you want? We have only 10 years of data!! ");

		Scanner cs = new Scanner(System.in);

		try {
			noOfYears = cs.nextInt();

			if (noOfYears <= 10) {
				
				status = true;

				int cYear = Calendar.getInstance().get(Calendar.YEAR);

				historyYear = cYear - noOfYears;

				displayHeader();
			}

			else
			{
				status = false;	
				
				System.out.println("Enter years between 1 and 10");
			}
			
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Enter a valid number");
			;
			e.printStackTrace();
		}
	}

	/**
	 * Displays the respective array.
	 */
	public void display() {
		
		setHistoryYear();

		if( status )
		{
		int len, versionYear = 0;
		boolean verFound = false;

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < 2; j++) {

				len = data[i][1].length();

				versionYear = Integer.parseInt(data[i][1].substring(len - 5).trim());

				if (versionYear >= historyYear  ) {
					verFound = true;
					System.out.print(data[i][j] + "\t" );
				}
			}
			
			if(versionYear >= historyYear )
			{
				System.out.println("");
				
				System.out.println("=======================================================");
			}
		}
		
		if (!verFound) {

			System.out.println(" No releases in this year ");
			}
		}
	}

	
	/**
	 * Displays the column names(Header)
	 */
	public void displayHeader() {
		System.out.println("=======================================================");

		System.out.println(" VERSION " + "\t" +"\t"   + " RELEASE DATE ");

		System.out.println("=======================================================");
	}

	
	/**
	 * Used to select the option enetred by the user regarding the five components.
	 */
	public void selectOption() {

		Scanner sc = new Scanner(System.in);

		for (;;) {
			
			System.out.println("Enter 1-5 of the following options: \n");

			System.out.println(" 1.JDK ");

			System.out.println(" 2.IDE ");

			System.out.println(" 3.Database ");

			System.out.println(" 4.Repository ");

			System.out.println(" 5.Application Server ");

			System.out.println(" 6.exit");

			int option = sc.nextInt();

			switch (option) {

			case 1:
				diaplayJdk();
				break;

			case 2:
				displayIde();
				break;

			case 3:
				displayDatabase();
				break;

			case 4:
				displayRepository();
				break;

			case 5:
				displayApplicationServer();
				break;

			case 6:
				System.exit(0);

			default:
				System.out.println(" Invalid option. Enter between 1 and 6 ");
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VersionMetrics vm = new VersionMetrics();

		vm.selectOption();
	}

}
 