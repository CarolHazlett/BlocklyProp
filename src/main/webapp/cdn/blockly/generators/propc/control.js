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
 * @fileoverview Generating Prop-C for control blocks.
 * @author michel@creatingfuture.eu  (Michel Lampo)
 */
'use strict';

if (!Blockly.Blocks)
    Blockly.Blocks = {};


Blockly.propc.controls_repeat = function() {
    var type = this.getFieldValue('TYPE');
    var branch = Blockly.propc.statementToCode(this, 'DO');
    if (Blockly.propc.INFINITE_LOOP_TRAP) {
        branch = Blockly.propc.INFINITE_LOOP_TRAP.replace(/%1/g,
                '\'' + this.id + '\'') + branch;
    }
    var order = Blockly.propc.ORDER_UNARY_PREFIX;
    var code = '';
    switch (type) {
        case "FOREVER":
            code = 'while(1) {\n' + branch + '}\n';
            break;
        case "TIMES":
            var repeats = Blockly.propc.valueToCode(this, 'TIMES', order) || '0';
            code = 'for (int n = 0; n < ' + repeats + '; n++) {\n' +
                    branch + '}\n';
            break;
        case "WHILE":
            var repeatCondition = Blockly.propc.valueToCode(this, 'REPEAT_CONDITION', order) || '0';
            code = 'while (' + repeatCondition + ') {\n' +
                    branch + '}\n';
            break;
        case "UNTIL":
            var repeatCondition = Blockly.propc.valueToCode(this, 'REPEAT_CONDITION', order) || '0';
            code = 'while (!(' + repeatCondition + ')) {\n' +
                    branch + '}\n';
            break;
    }
    return code;
};

Blockly.propc.controls_if = function() {
    // If/elseif/else condition.
    var n = 0;
    var argument = Blockly.propc.valueToCode(this, 'IF' + n,
            Blockly.propc.ORDER_NONE) || '0';
    var branch = Blockly.propc.statementToCode(this, 'DO' + n);
    var code = 'if (' + argument + ') {\n' + branch + '}\n';
    for (n = 1; n <= this.elseifCount_; n++) {
        argument = Blockly.propc.valueToCode(this, 'IF' + n,
                Blockly.propc.ORDER_NONE) || '0';
        branch = Blockly.propc.statementToCode(this, 'DO' + n);
        code += 'else if (' + argument + ') {\n' + branch + '}';
    }
    if (this.elseCount_) {
        branch = Blockly.propc.statementToCode(this, 'ELSE');
        code += 'else {\n' + branch + '}\n';
    }
    return code + '\n';
};
