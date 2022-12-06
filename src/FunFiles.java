/*
* A class for dealing with files
*
* @author LivNTI
 */
import java.io.File;
import java.io.IOException;

public class FunFiles {
    //attribut

    //Constructor
    public FunFiles(){
        //findFiles();
        createFile();
    }

    //methods

    /*
    * Method for finding all files in a specified path
     */
    public void findFiles(){
            File myPath= new File("C:\\Users\\liv.sundman\\Downloads");
            String[] allFiles= myPath.list();

            //Cycles througha list of fiel and folders to print them
            for(String fileNames: allFiles){
                System.out.println(fileNames);
            }
    }

    /*
    * Creata a new file if the file does not already exist
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



}
