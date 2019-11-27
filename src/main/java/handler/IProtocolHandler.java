package handler;

import bean.VCardDevice;
import interfaces.IClientStatusListener;
import interfaces.ICommandCallback;
import io.netty.channel.Channel;
import protocol.VCardMessage;

public interface IProtocolHandler {

    boolean initialize(IClientStatusListener listener);
    void reportClientMsg(Channel channel, String msg);
    // void addDevice(int deviceId);

    // 查找通道是否，有对应的 VCardDevice
    void removeBadDevice(Channel channel);
    VCardDevice find(Channel channel);
    VCardDevice find(int deviceId);
    void addNewDevice(Channel channel, VCardMessage message);
    void dealWithDeviceData(Channel channel, VCardMessage message);
    boolean sendData(VCardMessage telegram);
    boolean sendCommand(VCardMessage cmd, ICommandCallback callback);

}
