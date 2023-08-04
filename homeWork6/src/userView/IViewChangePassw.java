package userView;

public interface IViewChangePassw extends IViewBase{
    /**
     * строка - форма для изменения пароля
     * @param passw String "старый" пароль
     * @return строка со "старым" паролем и приглашением ввести новы пароль
     */
    public default String changePasswordForm(String passw) {
        showString("old Password: " + passw);
        showRequest("Password");
        return getUserStringForm();
    }
}
