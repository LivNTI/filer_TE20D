/*
* A class for dealing with files
*
* @author LivNTI
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FunFiles {
    //attribut
    String myFileName= "myFile.txt";
    //Constructor
    public FunFiles(){
        //findFiles();
        //createFile();
        writeToFile();
        fileReader();
    }

    //methods

    /*
    * Method for finding all files in a specified path
     */
    public void findFiles(){
            File myPath= new File("C:\\Users\\liv.sundman\\Downloads");
            String[] allFiles= myPath.list();

            //Cycles through a list of file and folders to print them
            for(String fileNames: allFiles){
                System.out.println(fileNames);
            }
    }

    /*
    * Create a new file if the file does not already exist
     */
    public void createFile(){
        File myFile= new File("test.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("file has been created");
            }else{
                System.out.println("file exsits");
            }
        } catch(IOException e){
            System.out.println("No can do mate!");
            e.printStackTrace();
        }
    }

    /*
    * Method to write data to file
    *
     */
    public void writeToFile(){
        //Will creat the file if it does not exist  and write to it
        try{
            //Filewriter will append the data in the file
            FileWriter myWriter= new FileWriter("myFile.txt",true);
            myWriter.write("This text is in my File\n");
            myWriter.close();
            System.out.println("data has been written");

        }catch(IOException e){
            System.out.println("Cannot write to file");
            e.printStackTrace();
        }
    }

    /*
    * Read data from a given file
     */
    public void fileReader(){
        File myFile= new File("myFile.txt");
        try {
            Scanner myScan = new Scanner(myFile);
            while(myScan.hasNextLine()) {
                String data = myScan.nextLine();
                System.out.println(data);
            }
        myScan.close();
        }catch(FileNotFoundException e){
            System.out.println("could not find file");
            e.printStackTrace();
        }

    }



}
