<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/16/016
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table class="easyui-datagrid" id="itemList" title="商品列表"
    data-options="singleSelect:false,pagination:true,url:'/item/list',method:'get',pageSize:30,toolbar:toolbar" >
    <thead>
    <tr>
        <th data-options="field:'ck',checkbox:true"></th>
        <th data-options="field:'id',width:60">商品ID</th>
        <th data-options="field:'title',width:200">商品标题</th>
        <th data-options="field:'cid',width:100">叶子类目</th>
        <th data-options="field:'sellPoint',width:100">卖点</th>
        <th data-options="field:'price',width:70,align:'right',formatter:TAOTAO.formatPrice">价格</th>
        <th data-options="field:'num',width:70,align:'right'">库存数量</th>
        <th data-options="field:'barcode',width:100">条形码</th>
        <th data-options="field:'status',width:60,align:'center',formatter:TAOTAO.formatItemStatus">状态</th>
        <th data-options="field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建日期</th>
        <th data-options="field:'updated',width:130,align:'center',formatter:TAOTAO.formatDateTime">更新日期</th>
    </tr>
    </thead>
</table>
<script type="text/javascript">
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add'
    },{
        text:'编辑',
        iconCls:'icon-edit'
    }
    ]
</script>
