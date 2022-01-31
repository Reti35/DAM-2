# -*- coding: utf-8 -*-
{
    'name': "Todoo",
    'summary': """
    Lista de tareas To-Do""",
    'description': """
    Lista de tareas To-Do como ejemplo de módulo desarrollado en Odoo
    """,
    'author': "René Ribera Medrano",
    'website': "",
    #Indicamos que es una aplicación, en contraposición a un módulo
    'application': True,
    # En la siguiente URL se indican las posibles categorías
    # https://github.com/odoo/odoo/blob/14.0/odoo/addons/base/data/ir_module_category_data.xml
    'category': '',
    'version': '1.0',
    # Indicamos lista de módulos de los que depende
    'depends': ['base'],
    'data': [
        #Política de acceso del modelo
        #Mas información en https://www.odoo.com/documentation/14.0/es/developer/howtos/rdtraining/05_securityintro.html
        'security/ir.model.access.csv',
        #Cargamos las vistas
        'views/views.xml',
    ]
}
