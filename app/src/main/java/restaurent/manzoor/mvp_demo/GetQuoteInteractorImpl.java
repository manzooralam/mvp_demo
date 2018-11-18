package restaurent.manzoor.mvp_demo;
import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class GetQuoteInteractorImpl implements GetQuoteInteractor{
    private List<String> arrayList = Arrays.asList(
            "1. Be yourself. everyone else is already taken.",
            "2. A room without books is like a body without a soul.",
            "3. You only live once, but if you do it right, once is enough.",
            "4. Be the change that you wish to see in the world.",
            "5. If you tell the truth, you don't have to remember anything."
    );

    @Override
    public void getNextQuote(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }

    private String getRandomString() {

        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        return arrayList.get(index);
    }
}
