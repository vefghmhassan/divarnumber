import Models.divarResponse.DivrResponse;
import Models.divarResponse.WidgetListItem;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    static int sizedata = 0;
    public static int page = 1;
    public static List<WidgetListItem> listItems;
   public static List<String>numbers;
    public static void main(String[] args) throws IOException, InterruptedException {
System.out.print("start .......................................");
        System.out.print("\n  wait  .......................................");
        numbers=new ArrayList<>();
      getAgainData(page);
      //  Repository.testweb();
    }


    public static void showNumer(int count, List<WidgetListItem> widgetList) throws IOException, InterruptedException {
        String  number= Repository.getnumberdivar(widgetList.get(count).getData().getToken());
        if (number != null) {
            if (!number.equals("")) {
                if (numbers != null||numbers.size()!=0) {
                    if (!numbers.contains(number)) {
                        numbers.add(number);
                        System.out.print("\n" + number);
                    }

                }else {
                    numbers.add(number);
                }
            }
        }
        //sizedata=count-1;
        if (count != widgetList.size() - 1) {
            Thread.sleep(6000);
            showNumer(count + 1, widgetList);
        } else {
            getAgainData(page + 1);
        }
    }

    public static void getAgainData(int page) throws IOException, InterruptedException {
        String s = Repository.GetData(page, "for-the-home");
        DivrResponse divrResponse = new Gson().fromJson(s, DivrResponse.class);
        if (divrResponse != null) {
            listItems = new ArrayList<>();

            listItems.addAll(divrResponse.getWidgetList());
            Thread.sleep(6000);
            showNumer(sizedata, divrResponse.getWidgetList());

        }
    }

}
