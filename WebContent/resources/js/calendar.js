/**
 * 
 */

jQuery(document).ready(function($) {
 upperText();
 function upperText() {
 $(".maiusculo").bind('paste', function(e) {
 var el = $(this);
 setTimeout(function() {
 var text = $(el).val();
 el.val(text.toUpperCase());
 }, 100);
 });
 
 $(".maiusculo").keypress(function() {
 var el = $(this);
 setTimeout(function() {
 var text = $(el).val();
 el.val(text.toUpperCase());
 }, 100);
 });
 }
 });

PrimeFaces.locales['pt'] = {  
                closeText: 'Fechar',  
                prevText: 'Anterior',  
                nextText: 'Próximo',  
                currentText: 'Começo',  
                monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],  
                monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun', 'Jul','Ago','Set','Out','Nov','Dez'],  
                dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],  
                dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sab'],  
                dayNamesMin: ['D','S','T','Q','Q','S','S'],  
                weekHeader: 'Semana',  
                firstDay: 1,  
                isRTL: false,  
                showMonthAfterYear: false,  
                yearSuffix: '',  
                timeOnlyTitle: 'Horário',  
                timeText: 'Tempo',  
                hourText: 'Hora',  
                minuteText: 'Minuto',  
                secondText: 'Segundo',  
                currentText: 'Data Atual',  
                ampm: false,  
                month: 'Mês',  
                week: 'Semana',  
                day: 'Dia',  
                allDayText : 'Todo Dia'  
            };