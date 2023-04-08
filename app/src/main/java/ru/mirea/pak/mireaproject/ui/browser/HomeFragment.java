package ru.mirea.pak.mireaproject.ui.browser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ru.mirea.pak.mireaproject.R;

public class HomeFragment extends Fragment {

    WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browser, container, false);

        webView = view.findViewById(R.id.WebViewId);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://yandex.ru");

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}