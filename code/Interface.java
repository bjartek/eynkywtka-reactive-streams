public interface Publisher<T> {
    public void subscribe(Subscriber<? super T> s);
}
public interface Subscriber<T> {
    public void onSubscribe(Subscription s);
    public void onNext(T t);
    public void onError(Throwable t);
    public void onComplete();
}
public interface Subscription {
    public void request(long n);
    public void cancel();
}
public interface Processor<T, R>
        extends Subscriber<T>, Publisher<R> {
}