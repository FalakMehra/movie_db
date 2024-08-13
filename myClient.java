import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.lang.System.Logger;
import vmm.DBLoader;
import java.sql.*;

public class myClient {

    public static String api = "9c6f3092062b986495d45a7abceec30d";

    public static String TopUpcoming() {
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/movie/upcoming?api_key=" + api).asString();
            if (res.getStatus() == 200) {
                return res.getBody();
            } else {
                return "server error";
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String TopTrending() {
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/movie/top_rated?api_key=" + api).asString();
            if (res.getStatus() == 200) {
                return res.getBody();
            } else {
                return res.getBody();
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String searchmovie(String movie) {
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/search/movie?query=" + movie + "&include_adult=false&language=en-US&page=1&api_key=" + api).asString();
            if (res.getStatus() == 200) {
                return res.getBody();
            } else {
                return res.getBody();
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String searchTV(String tv) {
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/search/tv?api_key=" + api + "&language=en-US&page=1&query=" + tv + "&include_adult=false" + api).asString();
            if (res.getStatus() == 200) {
                return res.getBody();
            } else {
                return res.getBody();
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String searchActor(String actorname) {
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/search/person?query=" + actorname + "&include_adult=false&language=en-US&page=1&api_key=" + api).asString();
            if (res.getStatus() == 200) {
                return res.getBody();
            } else {
                return res.getBody();
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String searchMovieHouse(String moviehouse) {
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/search/company?api_key=" + api + "&query=" + moviehouse + "&page=1").asString();
            if (res.getStatus() == 200) {
                return res.getBody();
            } else {
                return res.getBody();
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String Searchmultitask(String search) {
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/search/multi?api_key=" + api + "&language=en-US&query=" + search + "&page=1&include_adult=false").asString();
            if (res.getStatus() == 200) {
                return res.getBody();
            } else {
                return res.getBody();
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String addtofavtv(int id) {
        String ans = "";
        try {
            ResultSet rs = DBLoader.executeSql("Select * from fav_tv where email='" + global.email + "' and id=" + id);
            if (rs.next()) {
                rs.deleteRow();
                ans = "fail";
            } else {
                rs.moveToInsertRow();
                rs.updateString("email", global.email);
                rs.updateInt("id", id);
                rs.insertRow();
                ans = "pass";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String addtofavmovie(int id) {
        String ans = "";

        try {
            ResultSet rs = DBLoader.executeSql("Select * from fav_movie where email='" + global.email + "' and id=" + id);
            if (rs.next()) {
                rs.deleteRow();
                ans = "fail";
            } else {
                rs.moveToInsertRow();
                rs.updateString("email", global.email);
                rs.updateInt("id", id);
                rs.insertRow();
                ans = "pass";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String favMovie_check(int id) {
        String ans = "";
        try {
            ResultSet rs = DBLoader.executeSql("select * from fav_movie where email ='" + global.email + "'and id =" + id);
            if (rs.next()) {

                ans = "pass";

            } else {

                ans = "fail";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String favtv_check(int id) {
        String ans = "";
        try {
            ResultSet rs = DBLoader.executeSql("select * from fav_tv where email ='" + global.email + "'and id =" + id);
            if (rs.next()) {

                ans = "pass";

            } else {

                ans = "fail";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String showfav_movie(int id) {
        String ans = "";
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/movie/" + id + "?api_key=" + api + "&language=en-US").asString();
            ans = res.getBody();
        } catch (UnirestException ex) {
            ex.printStackTrace();
        }
        return ans;
    }

    public static String buttoncheck() {
        String ans1 = "";
        try {
            ResultSet rs = DBLoader.executeSql("select * from fav_movie where email ='" + global.email + "'");

            while (rs.next()) {
                int id = rs.getInt("id");
                ans1 += id + "$";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans1;
    }

    public static String showfav_tv(int id) {
        String ans = "";
        try {
            HttpResponse<String> res = Unirest.get("https://api.themoviedb.org/3/tv/" + id + "?api_key=" + api + "&language=en-US").asString();
            ans = res.getBody();
        } catch (UnirestException ex) {
            ex.printStackTrace();
        }
        return ans;
    }

    public static String buttoncheck1() {
        String ans1 = "";
        try {
            ResultSet rs = DBLoader.executeSql("select * from fav_tv where email ='" + global.email + "'");
            while (rs.next()) {
                int id = rs.getInt("id");
                ans1 += id + "$";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans1;
    }

}
