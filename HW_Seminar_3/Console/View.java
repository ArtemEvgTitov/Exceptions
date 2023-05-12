package HW_Seminar_3.Console;

public class View {

    GetValue getString;
    SetValue setString;


    public String GetString() {
        String string = getString.getValue();
        return string;
    }

    public void SetString(String msg) {
        String string = setString.setValueString(msg);
        System.out.println(string);
    }
    
}
