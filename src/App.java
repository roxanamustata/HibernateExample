import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
//            User user = new User("ral", "rox", "Ralu", "Roxana");
//            session.beginTransaction();
//            session.save(user);
//            session.getTransaction().commit();
//            System.out.println("user added!");

//            User user =  new User();
            session.beginTransaction();
//            user=session.get(User.class,2);
//            user.setUsername("ral@yahoo.ro");
//            user=session.get(User.class, 1);
//            session.delete(user);
//            List<User> users = session.createQuery("from user where firstName='Ralu' " + "OR last_name='elena'").getResultList();
//
//            for (User user : users
//            ) {
//                System.out.println(user);
//
//            }

//            session.createQuery("update user set password='bazda'").executeUpdate();
            session.createQuery("delete from user"+" where user_id='5'").executeUpdate();

            session.getTransaction().commit();
//            System.out.println(user);

        } finally {
            session.close();
            factory.close();

        }

    }
}
