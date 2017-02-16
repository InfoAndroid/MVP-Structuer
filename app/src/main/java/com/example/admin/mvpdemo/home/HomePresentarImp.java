package com.example.admin.mvpdemo.home;

import java.util.List;

/**
 * Created by admin on 16-02-2017.
 */

public class HomePresentarImp implements HomePresentar, FindItemsInteractor.OnFinishedListener {

    private HomeView homeView;
    private FindItemsInteractor findItemsInteractor;

    public HomePresentarImp(HomeView homeView, FindItemsInteractorImpl findItemsInteractor) {
        this.homeView = homeView;
        this.findItemsInteractor = new FindItemsInteractorImpl();
    }

    @Override
    public void onResume() {
        if (homeView != null) {
            homeView.showProgress();
        }
        findItemsInteractor.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        if (homeView != null) {
            homeView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        homeView = null;
    }

    @Override
    public void onFinished(List<String> items) {
        if (homeView != null) {
            homeView.setItems(items);
            homeView.hideProgress();
        }
    }

    public HomeView getHomeView() {
        return homeView;
    }
}
