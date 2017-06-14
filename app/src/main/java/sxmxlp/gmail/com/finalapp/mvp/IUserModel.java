package sxmxlp.gmail.com.finalapp.mvp;

/**
 * Created by Lee on 2017/6/14.
 */

public interface IUserModel<T> {
    T getData();
    void saveData(T data);
}
