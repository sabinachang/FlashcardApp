package com.enhan.sabina.speedy.detect;

import com.enhan.sabina.speedy.callbacks.DetectActivityCallback;
import com.enhan.sabina.speedy.data.roomdb.entity.StackEntity;

public class DetectNavigator implements DetectContract.Navigator {
    private static DetectNavigator INSTANCE;
    private DetectActivityCallback mDetectActivityCallback;

    private DetectNavigator() {

    }

    public static DetectNavigator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DetectNavigator();
        }
        return INSTANCE;
    }

    public void setDetectActivityCallback(DetectActivityCallback callback) {
        mDetectActivityCallback = callback;
    }

    @Override
    public void onDialogCloseButtonClickedNavigator() {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.onDialogCloseButtonClicked();
        }
    }

    @Override
    public void onStackSelectedNavigator(StackEntity stackEntity) {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.onStackSelected(stackEntity);
        }
    }

    @Override
    public void updateTabCountHintNavigator(int num) {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.updateTabCountHint(num);
        }
    }

    @Override
    public void activateFabNavigator() {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.activateFab();
        }
    }

    @Override
    public void deactivateFabNavigator() {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.deactivateFab();
        }
    }

    @Override
    public void isWordDuplicateNavigator(boolean duplicate) {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.isWordDuplicate(duplicate);
        }
    }

    @Override
    public void onAddStackButtonClickedNavigator(StackEntity stackEntity) {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.onAddStackButtonClicked(stackEntity);
        }
    }

    @Override
    public void addDatabaseListenerNavigator(StackItemAdapter adapter) {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.addDatabaseListener(adapter);
        }
    }

    @Override
    public void updateTagline(String word) {
        if (mDetectActivityCallback != null) {
            mDetectActivityCallback.updateTagline(word);
        }
    }
}
