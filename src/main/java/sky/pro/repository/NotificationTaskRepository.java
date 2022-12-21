package sky.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sky.pro.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Integer> {

    @Query(value = "SELECT * FROM notification_task WHERE date_to_send = :date", nativeQuery = true)
    List<NotificationTask> findNearest(@Param("date") LocalDateTime date);
}
