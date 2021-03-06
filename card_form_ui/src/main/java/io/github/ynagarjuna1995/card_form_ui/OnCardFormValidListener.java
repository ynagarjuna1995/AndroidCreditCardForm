package io.github.ynagarjuna1995.card_form_ui;

/**
 * Listener to receive a callback when the card form becomes valid or invalid
 */
public interface OnCardFormValidListener {

    /**
     * Called when the card form becomes valid or invalid
     * @param valid indicates wither the card form is currently valid or invalid
     */
    void onCardFormValid(boolean valid);
}
