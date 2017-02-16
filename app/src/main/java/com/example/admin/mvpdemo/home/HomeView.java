package com.example.admin.mvpdemo.home;

import java.util.List;

/**
 * Created by admin on 16-02-2017.
 */

public interface HomeView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
