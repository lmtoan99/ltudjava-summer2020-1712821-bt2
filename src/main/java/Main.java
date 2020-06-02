import DAO.*;
import pojo.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<TkbSV> user = TkbSVDAO.layDanhSachTkbSV();
        System.out.println(user.get(0).toString());
    }
}
