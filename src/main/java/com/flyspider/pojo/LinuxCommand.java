package com.flyspider.pojo;
import java.io.Serializable;

public class LinuxCommand implements Serializable{
    private int id;
    private int commandlinefuId;
    private String command;
    private String summary;
    private String fileName;
    private boolean hide;
    private boolean shown;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCommandlinefuId(int commandlinefuId) {
        this.commandlinefuId = commandlinefuId;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public int getCommandlinefuId() {
        return commandlinefuId;
    }
    public void setCommandlinefuId(Integer commandlinefuId) {
        this.commandlinefuId = commandlinefuId;
    }
    public String getCommand() {
        return command;
    }
    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
    public boolean isShown() {
        return shown;
    }
    public void setShown(boolean shown) {
        this.shown = shown;
    }
}