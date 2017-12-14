/**
 * Created by 11007122 on 13.12.2017.
 */
public class TerminalImpl implements Terminal {
    TerminalServer server = new TerminalServer();
    PinValidator pin = new PinValidator();
    GuiKeyboard gui = new GuiKeyboard();

    @Override
    public void checkBalance() {

    }
}
