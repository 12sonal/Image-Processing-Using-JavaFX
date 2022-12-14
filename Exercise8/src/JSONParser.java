package Exercise8;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParser {
    public static void main(String[] args) throws IOException
    {

        File inputFile = new File("D:\\Soni\\Soni In US\\NorthEastern\\SEM 1\\AED\\Backup\\Exercise8\\src\\test.json");
            String json = FileUtils.readFileToString(inputFile, "UTF-8");
            JSONObject obj = new JSONObject(json);

            System.out.println("vRoot element : BookShelf");
            System.out.println("----------------------------");

            JSONObject bookShelf = obj.getJSONObject("BookShelf");
            JSONArray books = bookShelf.getJSONArray("Book");
            for (int i = 0; i < books.length(); i++)
            {
                String title = books.getJSONObject(i).getString("title");
                System.out.println("Title: " + title);
                String publishedYear = String.valueOf(books.getJSONObject(i).getInt("publishedYear"));
                System.out.println("Published Year: " + publishedYear);
                String numberOfPages = String.valueOf(books.getJSONObject(i).getInt("numberOfPages"));
                System.out.println("Number Of Pages: " + numberOfPages);

                JSONArray authors = books.getJSONObject(i).getJSONArray("authors");
                System.out.println("Authors");
                for(int j = 0; j < authors.length(); j++)
                {
                    String authorName = authors.getJSONObject(j).getString("title");
                    System.out.println(" ->" + authorName);
                }
                System.out.println();

            }
        }
    }

