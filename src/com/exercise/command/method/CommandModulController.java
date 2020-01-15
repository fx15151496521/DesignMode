package com.exercise.command.method;

import java.util.Stack;

/**
 * @Description:
 * @Date: 2020/1/15 16:57
 */
public class CommandModulController implements Controller {

    private Command[] onCommands;

    private Command[] offCommands;

    private Stack<Command> stack = new Stack<>();

    public CommandModulController () {
        onCommands = new Command[5];
        offCommands = new Command[5];

        Command noCommand = new NoCommand();

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < onCommands.length) {
            this.onCommands[slot] = onCommand;
            this.offCommands[slot] = offCommand;
        }
    }

    @Override
    public void onCommand(int slot) {
        if (slot < onCommands.length) {
            onCommands[slot].execute();
            stack.push(onCommands[slot]);
        }
    }

    @Override
    public void offCommand(int slot) {
        if (slot < onCommands.length) {
            offCommands[slot].execute();
            stack.push(offCommands[slot]);
        }
    }

    @Override
    public void undoCommand() {
        stack.pop().undo();
    }
}
