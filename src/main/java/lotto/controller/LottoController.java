package lotto.controller;

import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    public void start() {
        InputPurchaseAmount();
    }

    public void InputPurchaseAmount() {
        OutputView.askPurchaseAmount();
        int perchaseAmount = InputView.getPerchaseAmount();
    }
}
