/**
 * Visual Blocks Language
 *
 * Copyright 2012 Google Inc.
 * http://blockly.googlecode.com/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @fileoverview Logic blocks for Blockly.
 * @author fraser@google.com (Neil Fraser)
 */
'use strict';

Blockly.Blocks.logic_compare = {
    // Comparison operator.
    category: Blockly.LANG_CATEGORY_LOGIC,
    helpUrl: Blockly.LANG_LOGIC_COMPARE_HELPURL,
    init: function () {
        this.setColour(colorPalette.getColor('programming'));
        this.setOutput(true, 'Boolean');
        this.appendValueInput('A');
        this.appendValueInput('B')
                .appendField(new Blockly.FieldDropdown(this.OPERATORS), 'OP');
        this.setInputsInline(true);
        // Assign 'this' to a variable for use in the tooltip closure below.
        var thisBlock = this;
        this.setTooltip(function () {
            var op = thisBlock.getFieldValue('OP');
            return Blockly.Language.logic_compare.TOOLTIPS[op];
        });
    }
};

Blockly.Blocks.logic_compare.OPERATORS =
        [['=', 'EQ'],
            ['\u2260', 'NEQ'],
            ['<', 'LT'],
            ['\u2264', 'LTE'],
            ['>', 'GT'],
            ['\u2265', 'GTE']];

Blockly.Blocks.logic_compare.TOOLTIPS = {
    EQ: Blockly.LANG_LOGIC_COMPARE_TOOLTIP_EQ,
    NEQ: Blockly.LANG_LOGIC_COMPARE_TOOLTIP_NEQ,
    LT: Blockly.LANG_LOGIC_COMPARE_TOOLTIP_LT,
    LTE: Blockly.LANG_LOGIC_COMPARE_TOOLTIP_LTE,
    GT: Blockly.LANG_LOGIC_COMPARE_TOOLTIP_GT,
    GTE: Blockly.LANG_LOGIC_COMPARE_TOOLTIP_GTE
};

Blockly.Blocks.logic_operation = {
    // Logical operations: 'and', 'or'.
    category: Blockly.LANG_CATEGORY_LOGIC,
    helpUrl: Blockly.LANG_LOGIC_OPERATION_HELPURL,
    init: function () {
        this.setColour(colorPalette.getColor('programming'));
        this.setOutput(true, 'Boolean');
        this.appendValueInput('A')
                .setCheck('Boolean');
        this.appendValueInput('B')
                .setCheck('Boolean')
                .appendField(new Blockly.FieldDropdown(this.OPERATORS), 'OP');
        this.setInputsInline(true);
        // Assign 'this' to a variable for use in the tooltip closure below.
//    var thisBlock = this;
//    this.setTooltip(function() {
//      var op = thisBlock.getFieldValue('OP');
//      return Blockly.Language.logic_operation.TOOLTIPS[op];
//    });
    }
};

Blockly.Blocks.logic_operation.OPERATORS =
        [[Blockly.LANG_LOGIC_OPERATION_AND, 'AND'],
            [Blockly.LANG_LOGIC_OPERATION_OR, 'OR'],
            ['and not', 'AND_NOT'],
            ['or not', 'OR_NOT']];

Blockly.Blocks.logic_operation.TOOLTIPS = {
    AND: Blockly.LANG_LOGIC_OPERATION_TOOLTIP_AND,
    OR: Blockly.LANG_LOGIC_OPERATION_TOOLTIP_OR
};

Blockly.Blocks.logic_negate = {
    // Negation.
    category: Blockly.LANG_CATEGORY_LOGIC,
    helpUrl: Blockly.LANG_LOGIC_NEGATE_HELPURL,
    init: function () {
        this.setColour(colorPalette.getColor('programming'));
        this.setOutput(true, 'Boolean');
        this.appendValueInput('BOOL')
                .setCheck('Boolean')
                .appendField(Blockly.LANG_LOGIC_NEGATE_INPUT_NOT);
        this.setTooltip(Blockly.LANG_LOGIC_NEGATE_TOOLTIP);
    }
};

Blockly.Blocks.logic_boolean = {
    // Boolean data type: true and false.
    category: Blockly.LANG_CATEGORY_LOGIC,
    helpUrl: Blockly.LANG_LOGIC_BOOLEAN_HELPURL,
    init: function () {
        this.setColour(colorPalette.getColor('programming'));
        this.setOutput(true, 'Boolean');
        this.appendDummyInput()
                .appendField(new Blockly.FieldDropdown(this.OPERATORS), 'BOOL');
        this.setTooltip(Blockly.LANG_LOGIC_BOOLEAN_TOOLTIP);
    }
};

Blockly.Blocks.logic_boolean.OPERATORS =
        [[Blockly.LANG_LOGIC_BOOLEAN_TRUE, 'TRUE'],
            [Blockly.LANG_LOGIC_BOOLEAN_FALSE, 'FALSE']];

Blockly.Blocks.logic_null = {
    // Null data type.
    category: Blockly.LANG_CATEGORY_LOGIC,
    helpUrl: Blockly.LANG_LOGIC_NULL_HELPURL,
    init: function () {
        this.setColour(colorPalette.getColor('programming'));
        this.setOutput(true, null);
        this.appendDummyInput()
                .appendField(Blockly.LANG_LOGIC_NULL);
        this.setTooltip(Blockly.LANG_LOGIC_NULL_TOOLTIP);
    }
};
