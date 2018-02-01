package javapractice.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

interface FileReceiver{
    public void openFile();
    public void writeFile();
    public void closeFile();
}

class FR implements FileReceiver{
    public void openFile() {
        System.out.print("Open file");
    }

    public void writeFile() {
        System.out.print("write file");

    }

    public void closeFile() {
        System.out.print("close file");

    }
}
interface Command{
    void execute();
}

class OpenFile implements Command{
    FileReceiver fileReceiver;
    OpenFile(FileReceiver fileReceiver){
        this.fileReceiver=fileReceiver;
    }
    public void execute() {
        fileReceiver.openFile();
    }
}

class CloseFile implements Command{
    FileReceiver fileReceiver;

    public CloseFile(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    public void execute() {
        fileReceiver.closeFile();
    }
}

class WriteFile implements Command{
    FileReceiver fileReceiver;

    public WriteFile(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    public void execute() {
        fileReceiver.writeFile();
    }
}

class Macro{
    List<Command> commandList=new ArrayList<Command>();

    public void add(Command command){
        this.commandList.add(command);
    }
}

public class CommandPtrnExample {

    public static void main(String args[]){
        FR fileReceiver = new FR();
        Macro macro=new Macro();
        macro.add(new OpenFile(fileReceiver));
        macro.add(new WriteFile(fileReceiver));
        macro.add(new CloseFile(fileReceiver));
        macro.commandList.forEach(Command::execute);

    }
}