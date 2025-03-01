.class final Lcom/saterskog/cell_lab/g$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/g;->onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/g;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/g;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/saterskog/cell_lab/g$1;->a:Lcom/saterskog/cell_lab/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v2, -0x1

    .line 83
    iget-object v1, p0, Lcom/saterskog/cell_lab/g$1;->a:Lcom/saterskog/cell_lab/g;

    .line 1190
    packed-switch p2, :pswitch_data_0

    .line 1227
    :cond_0
    :goto_0
    return-void

    .line 1192
    :pswitch_0
    iget v0, v1, Lcom/saterskog/cell_lab/g;->c:I

    if-eq v0, v2, :cond_0

    .line 1193
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getFilesDir()Ljava/io/File;

    move-result-object v2

    .line 1194
    new-instance v3, Ljava/io/File;

    iget-object v0, v1, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    iget v4, v1, Lcom/saterskog/cell_lab/g;->c:I

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/saterskog/cell_lab/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1195
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 1196
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->a()V

    .line 1197
    iget-object v0, v1, Lcom/saterskog/cell_lab/g;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 1201
    :pswitch_1
    iget v0, v1, Lcom/saterskog/cell_lab/g;->c:I

    if-eq v0, v2, :cond_0

    .line 1202
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1203
    const-string v0, "message/rfc822"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1206
    const-string v0, "android.intent.extra.SUBJECT"

    const v3, 0x7f0e0083

    invoke-virtual {v1, v3}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1207
    const-string v0, "android.intent.extra.TEXT"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0e0082

    .line 1209
    invoke-virtual {v1, v4}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0e001a

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " at "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0e00fd

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1207
    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1211
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getFilesDir()Ljava/io/File;

    move-result-object v3

    .line 1212
    new-instance v4, Ljava/io/File;

    iget-object v0, v1, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    iget v5, v1, Lcom/saterskog/cell_lab/g;->c:I

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/saterskog/cell_lab/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1213
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v3, "com.saterskog.cell_lab.MainMenuLab"

    invoke-static {v0, v3, v4}, Landroid/support/v4/content/FileProvider;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 1215
    const-string v3, "android.intent.extra.STREAM"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1216
    invoke-virtual {v2, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1217
    const-string v0, "user_action"

    const-string v3, "share_genome"

    .line 1219
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-static {v4}, Lcom/saterskog/b/a;->b(Landroid/content/Context;)J

    move-result-wide v4

    .line 1220
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v6

    .line 1217
    invoke-static {v0, v3, v4, v5, v6}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V

    .line 1222
    const v0, 0x7f0e0084

    :try_start_0
    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/g;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 1224
    :catch_0
    move-exception v0

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v2, 0x7f0e019b

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 1225
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 1230
    :pswitch_2
    iget v0, v1, Lcom/saterskog/cell_lab/g;->c:I

    if-eq v0, v2, :cond_0

    .line 1231
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getFilesDir()Ljava/io/File;

    move-result-object v5

    .line 1232
    new-instance v4, Ljava/io/File;

    iget-object v0, v1, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    iget v2, v1, Lcom/saterskog/cell_lab/g;->c:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/saterskog/cell_lab/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1233
    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1235
    const v0, 0x7f0e0065

    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1238
    new-instance v2, Landroid/widget/EditText;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 1241
    invoke-virtual {v2, v7}, Landroid/widget/EditText;->setInputType(I)V

    .line 1242
    iget-object v0, v1, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    iget v3, v1, Lcom/saterskog/cell_lab/g;->c:I

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1243
    invoke-virtual {v6, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1244
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v3

    .line 1246
    const v0, 0x7f0e005d

    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lcom/saterskog/cell_lab/g$5;

    invoke-direct/range {v0 .. v5}, Lcom/saterskog/cell_lab/g$5;-><init>(Lcom/saterskog/cell_lab/g;Landroid/widget/EditText;Landroid/app/Activity;Ljava/io/File;Ljava/io/File;)V

    invoke-virtual {v6, v7, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1272
    const v0, 0x7f0e0061

    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/saterskog/cell_lab/g$6;

    invoke-direct {v2, v1}, Lcom/saterskog/cell_lab/g$6;-><init>(Lcom/saterskog/cell_lab/g;)V

    invoke-virtual {v6, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1279
    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1281
    iget-object v0, v1, Lcom/saterskog/cell_lab/g;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    goto/16 :goto_0

    .line 1190
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
