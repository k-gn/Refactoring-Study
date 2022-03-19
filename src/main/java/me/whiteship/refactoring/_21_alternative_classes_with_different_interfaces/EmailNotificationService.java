package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class EmailNotificationService implements NotificationService {

    private MessageService messageService;

    public EmailNotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void sendNotification(Notification notification) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(notification.getTitle());
        emailMessage.setTo(notification.getReceiver());
        emailMessage.setFrom(notification.getSender());
        messageService.send(emailMessage);
    }
}
