package calcPresenter;

import complexNumber.ComplexNumber;

public interface IPresenter extends IPresenterBase, IPresenterMakeRequest, IPresenterRequest{
    //    public void showComplexNumber(float a, String sign, float b) {
//        view.showComplexNumber(a, sign, b);
//    }
    void showComplexNumber(ComplexNumber complexNumber);
}
