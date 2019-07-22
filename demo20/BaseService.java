public abstract class BaseService<T, Q> {
  public abstract T create(Q q);

  public abstract T cancel(Q q);
}