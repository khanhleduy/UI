package l.com.ldk.duykhanh.bestui.FRAGMENT;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import l.com.ldk.duykhanh.bestui.LOGIN.LoginPageActivity;
import l.com.ldk.duykhanh.bestui.R;

public class FragmentSplash extends Fragment {
    private ImageView mImageView;
    private TextView mTextView;
    private Thread mThread;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash,container,false);
        mImageView = (ImageView) view.findViewById(R.id.image);
        mTextView = (TextView) view.findViewById(R.id.text);
        startAnimation();


        return view;
    }

    private void startAnimation() {
        Animation rotate = AnimationUtils.loadAnimation(getContext(), R.anim.rotate);
        Animation translate = AnimationUtils.loadAnimation(getContext(), R.anim.translate);

        rotate.reset();
        translate.reset();

        mImageView.setAnimation(rotate);
        mTextView.setAnimation(translate);

        mThread = new Thread() {
            @Override
            public void run() {
                super.run();
                int waited = 0;
                while (waited < 2500) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    waited += 100;
                }
                Intent intent = new Intent(getContext(), LoginPageActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

            }
        };
        mThread.start();
    }

}
