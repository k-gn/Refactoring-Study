package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class AlertNotificationService implements NotificationService {

    private MessageService messageService;

    public AlertNotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void sendNotification(Notification notification) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setTitle(notification.getTitle());
        alertMessage.setTo(notification.getReceiver());
        messageService.send(alertMessage);
    }
}
