package me.fmenu.fmenu.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class CommandExecEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Boolean cancelled;
    private Boolean continued;
    private final Player player;
    private final String command;
    private final String rawCommand;
    private final String[] args;
    
    
    public CommandExecEvent(Player player,String command,String rawCommand,String[] args){
        this.cancelled = false;
        this.continued = false;
        this.player = player;
        this.command = command;
        this.rawCommand = rawCommand;
        this.args = args;
    }
    
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * 获取命令参数
     * @return Args
     */
    public String[] getArgs(){
        return args;
    }

    /**
     * 获取玩家
     * @return Player
     */
    public Player getPlayer(){
        return player;
    }

    /**
     * 获取将要执行的命令
     * @return Command
     */
    public String getCommand(){
        return command;
    }

    /**
     * 获取原始命令
     * @return RawCommand
     */
    public String getRawCommand(){
        return rawCommand;
    }

    /**
     * 获取指令集是否被取消
     * @return cancelled
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * 设置指令集是否被取消
     * @param b cancelled
     */
    @Override
    public void setCancelled(boolean b) {
        cancelled = b;
    }

    /**
     * 获取该指令是否被取消
     * @return continued
     */
    public boolean isContinued() {
        return continued;
    }

    /**
     * 是否跳过此指令的执行
     * @param b 是否跳过
     */
    public void setContinued(boolean b) {
        continued = b;
    }
}
