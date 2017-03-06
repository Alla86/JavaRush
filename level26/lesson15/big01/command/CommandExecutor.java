package com.javarush.test.level26.lesson15.big01.command;



        import com.javarush.test.level26.lesson15.big01.Operation;
        import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

        import java.util.HashMap;
        import java.util.Map;

/**
 * Created by Alla on 17.08.16.
 */
public class CommandExecutor {
    private CommandExecutor() {}
    private static Map<Operation, Command> map = new HashMap<Operation, Command>();
    static{
        map.put(Operation.LOGIN, new LoginCommand());
        map.put(Operation.INFO, new InfoCommand());
        map.put(Operation.DEPOSIT, new DepositCommand());
        map.put(Operation.WITHDRAW, new WithdrawCommand());
        map.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        map.get(operation).execute();
    }
}