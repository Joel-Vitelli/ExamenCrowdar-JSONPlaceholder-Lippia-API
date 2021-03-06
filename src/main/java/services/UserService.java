package services;

import api.model.CreateNewUser;
import api.model.User;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class UserService extends MethodsService {

    public static Response get(String jsonName) {
       return get(jsonName, User.class);
    }

    public static Response post(String jsonName) {
        return post(jsonName, CreateNewUser.class);
    }

    public static Response put(String jsonName) {
        return put(jsonName, CreateNewUser.class);
    }

    public static Response delete(String jsonName) {
        return delete(jsonName, CreateNewUser.class);
    }

}
