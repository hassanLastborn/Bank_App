
import java.io.File;
import javax.swing.filechooser.FileFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author test
 */
public class BofFilter extends FileFilter {

    public BofFilter() {
    }

    @Override
    public boolean accept(File f) { //Method used to determine whether should show up/not.
        if (f.isDirectory() || f.getName().toLowerCase().endsWith(".bof")) {                     //Now we want to accept directory. And it has to be one in our extension.
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String getDescription() {
        return "Bank Object File";
    }

}
