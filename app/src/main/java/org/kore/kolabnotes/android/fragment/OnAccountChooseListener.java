package org.kore.kolabnotes.android.fragment;

import org.kore.kolabnotes.android.content.AccountIdentifier;

/**
 * Created by koni on 10.09.15.
 */
public interface OnAccountChooseListener {
    void onAccountElected(String name, AccountIdentifier accountIdentifier);
}
