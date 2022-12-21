package sky.pro.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "notification_task")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "chat_id")
    private long chatId;
    @Column(name = "notification_text")
    private String notificationText;
    @Column(name = "date_to_send")
    private LocalDateTime dateToSend;

    public int getId() {
        return id;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public LocalDateTime getDateToSend() {
        return dateToSend;
    }

    public void setDateToSend(LocalDateTime dateToSend) {
        this.dateToSend = dateToSend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTask task = (NotificationTask) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "NotificationTask{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", notificationText='" + notificationText + '\'' +
                ", dateToSend=" + dateToSend +
                '}';
    }
}
