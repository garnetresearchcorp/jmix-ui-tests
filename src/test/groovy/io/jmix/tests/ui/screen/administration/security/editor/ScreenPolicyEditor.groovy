package io.jmix.tests.ui.screen.administration.security.editor

import io.jmix.masquerade.Wire
import io.jmix.masquerade.base.Composite
import io.jmix.masquerade.component.Button
import io.jmix.masquerade.component.CheckBox
import io.jmix.masquerade.component.ComboBox
import io.jmix.masquerade.component.TextField

class ScreenPolicyEditor extends Composite<ScreenPolicyEditor> {
    @Wire
    ComboBox screenField

    @Wire
    TextField policyGroupField

    @Wire
    TextField menuItemField

    @Wire
    CheckBox menuAccessField

    @Wire
    Button commit

}
