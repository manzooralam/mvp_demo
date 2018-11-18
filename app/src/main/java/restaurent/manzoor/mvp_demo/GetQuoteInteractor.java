package restaurent.manzoor.mvp_demo;

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
