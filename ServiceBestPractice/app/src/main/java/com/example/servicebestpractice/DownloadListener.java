package com.example.servicebestpractice;

/**
 * Created by Administrator on 2023/5/30 0030.
 */

public interface DownloadListener {
    public void onProgress(int progress);
    public void onSuccess();
    public void onFailed();
    public void onPaused();
    public void onCanceled();
}
