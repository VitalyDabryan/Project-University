package allJSON;
import model.Statistics;
import model.Student;
import model.University;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static readWriteFile.ReadFile.log;


public class WriteJSONFile {

    static LocalDateTime current = LocalDateTime.now();
    static DateTimeFormatter format = DateTimeFormatter.ofPattern("_dd_MM_yyyy");
    static String formatedDate = current.format(format);

    //запись json-файла коллекции университетов
    public static void writeJSONFileUniversity(ArrayList<University> universities) {
        try (PrintWriter out = new PrintWriter
                (new FileWriter("C:\\Users\\100nout\\Downloads\\jsonReqs\\reqUni" +formatedDate + ".json"))) {
            log.info("JSON файл университетов создан");
            out.write(JsonUtil.jsonAllUniversities(universities));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //запись json-файла коллекции студентов
    public static void writeJSONFileStudents(ArrayList<Student> students) {
        try (PrintWriter out = new PrintWriter
                (new FileWriter("C:\\Users\\100nout\\Downloads\\jsonReqs\\reqStudent" +formatedDate + ".json"))) {
            log.info("JSON файл студентов создан");
            out.write(JsonUtil.jsonAllStudents(students));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //запись json-файла коллекции статистики
    public static void writeJSONFileStatistics(ArrayList<Statistics> statistics) {
        try (PrintWriter out = new PrintWriter
                (new FileWriter("C:\\Users\\100nout\\Downloads\\jsonReqs\\reqStatistics" +formatedDate + ".json"))) {
            log.info("JSON файл коллекции статистики создан");
            out.write(JsonUtil.jsonAllStatistics(statistics));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
