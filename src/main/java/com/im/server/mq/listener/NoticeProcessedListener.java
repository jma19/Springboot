//package com.im.server.mq.listener;
//
//import com.im.server.common.Constants;
//import com.im.server.common.ServiceException;
//import com.im.server.mode.NoticePlan;
//import com.im.server.mode.paramter.NoticeBody;
//import com.im.server.mode.paramter.SendNoticeRequestEntity;
//import com.im.server.service.IdWorkerService;
//import com.im.server.service.NoticeMgtService;
//import com.im.server.service.NoticePlanMgtService;
//import com.im.server.service.sender.NoticePlanCreateMsgSender;
//import com.im.server.service.NoticePlanCreateService;
//import com.im.server.utils.JsonUtils;
//import com.rabbitmq.client.Channel;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
///**
// * Created by majun on 16/1/20.
// */
//@Component("noticeProcessedListener")
//public class NoticeProcessedListener implements ChannelAwareMessageListener {
//
//    private static Log logger = LogFactory.getLog(NoticeProcessedListener.class);
//
//    @Override
//    public void onMessage(Message message, Channel channel) throws Exception {
//
//        String jsonMessage = new String(message.getBody());
//        try {
//
//        } finally {
//            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//        }
//
//    }
//}
//
//
