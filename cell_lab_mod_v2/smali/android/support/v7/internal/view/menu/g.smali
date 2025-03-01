.class public Landroid/support/v7/internal/view/menu/g;
.super Landroid/support/v7/internal/view/menu/c;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/g$b;,
        Landroid/support/v7/internal/view/menu/g$a;,
        Landroid/support/v7/internal/view/menu/g$c;,
        Landroid/support/v7/internal/view/menu/g$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/internal/view/menu/c",
        "<",
        "Landroid/support/v4/b/a/b;",
        ">;",
        "Landroid/view/MenuItem;"
    }
.end annotation


# instance fields
.field public e:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/support/v4/b/a/b;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/menu/c;-><init>(Landroid/content/Context;Ljava/lang/Object;)V

    .line 50
    return-void
.end method


# virtual methods
.method a(Landroid/view/ActionProvider;)Landroid/support/v7/internal/view/menu/g$a;
    .locals 2

    .prologue
    .line 309
    new-instance v0, Landroid/support/v7/internal/view/menu/g$a;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/g;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, Landroid/support/v7/internal/view/menu/g$a;-><init>(Landroid/support/v7/internal/view/menu/g;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-object v0
.end method

.method public collapseActionView()Z
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->collapseActionView()Z

    move-result v0

    return v0
.end method

.method public expandActionView()Z
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->expandActionView()Z

    move-result v0

    return v0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    .prologue
    .line 267
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->a()Landroid/support/v4/view/d;

    move-result-object v0

    .line 268
    instance-of v1, v0, Landroid/support/v7/internal/view/menu/g$a;

    if-eqz v1, :cond_0

    .line 269
    check-cast v0, Landroid/support/v7/internal/view/menu/g$a;

    iget-object v0, v0, Landroid/support/v7/internal/view/menu/g$a;->b:Landroid/view/ActionProvider;

    .line 271
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getActionView()Landroid/view/View;
    .locals 2

    .prologue
    .line 251
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getActionView()Landroid/view/View;

    move-result-object v0

    .line 252
    instance-of v1, v0, Landroid/support/v7/internal/view/menu/g$b;

    if-eqz v1, :cond_0

    .line 253
    check-cast v0, Landroid/support/v7/internal/view/menu/g$b;

    .line 1398
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/g$b;->a:Landroid/view/CollapsibleActionView;

    check-cast v0, Landroid/view/View;

    .line 255
    :cond_0
    return-object v0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getAlphabeticShortcut()C

    move-result v0

    return v0
.end method

.method public getGroupId()I
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getGroupId()I

    move-result v0

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getItemId()I

    move-result v0

    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    return-object v0
.end method

.method public getNumericShortcut()C
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getNumericShortcut()C

    move-result v0

    return v0
.end method

.method public getOrder()I
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getOrder()I

    move-result v0

    return v0
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/g;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hasSubMenu()Z
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public isActionViewExpanded()Z
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->isActionViewExpanded()Z

    move-result v0

    return v0
.end method

.method public isCheckable()Z
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->isCheckable()Z

    move-result v0

    return v0
.end method

.method public isChecked()Z
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->isChecked()Z

    move-result v0

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->isVisible()Z

    move-result v0

    return v0
.end method

.method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 2

    .prologue
    .line 260
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/g;->a(Landroid/view/ActionProvider;)Landroid/support/v7/internal/view/menu/g$a;

    move-result-object v1

    :goto_0
    invoke-interface {v0, v1}, Landroid/support/v4/b/a/b;->a(Landroid/support/v4/view/d;)Landroid/support/v4/b/a/b;

    .line 262
    return-object p0

    .line 260
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public setActionView(I)Landroid/view/MenuItem;
    .locals 3

    .prologue
    .line 239
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setActionView(I)Landroid/view/MenuItem;

    .line 241
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0}, Landroid/support/v4/b/a/b;->getActionView()Landroid/view/View;

    move-result-object v1

    .line 242
    instance-of v0, v1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    new-instance v2, Landroid/support/v7/internal/view/menu/g$b;

    invoke-direct {v2, v1}, Landroid/support/v7/internal/view/menu/g$b;-><init>(Landroid/view/View;)V

    invoke-interface {v0, v2}, Landroid/support/v4/b/a/b;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 246
    :cond_0
    return-object p0
.end method

.method public setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 229
    instance-of v0, p1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    .line 230
    new-instance v0, Landroid/support/v7/internal/view/menu/g$b;

    invoke-direct {v0, p1}, Landroid/support/v7/internal/view/menu/g$b;-><init>(Landroid/view/View;)V

    move-object p1, v0

    .line 232
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 233
    return-object p0
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    .line 143
    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setCheckable(Z)Landroid/view/MenuItem;

    .line 154
    return-object p0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setChecked(Z)Landroid/view/MenuItem;

    .line 165
    return-object p0
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setEnabled(Z)Landroid/view/MenuItem;

    .line 186
    return-object p0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setIcon(I)Landroid/view/MenuItem;

    .line 104
    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 98
    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;

    .line 115
    return-object p0
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setNumericShortcut(C)Landroid/view/MenuItem;

    .line 132
    return-object p0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    if-eqz p1, :cond_0

    new-instance v1, Landroid/support/v7/internal/view/menu/g$c;

    invoke-direct {v1, p0, p1}, Landroid/support/v7/internal/view/menu/g$c;-><init>(Landroid/support/v7/internal/view/menu/g;Landroid/view/MenuItem$OnActionExpandListener;)V

    :goto_0
    invoke-interface {v0, v1}, Landroid/support/v4/b/a/b;->a(Landroid/support/v4/view/k$e;)Landroid/support/v4/b/a/b;

    .line 293
    return-object p0

    .line 291
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    if-eqz p1, :cond_0

    new-instance v1, Landroid/support/v7/internal/view/menu/g$d;

    invoke-direct {v1, p0, p1}, Landroid/support/v7/internal/view/menu/g$d;-><init>(Landroid/support/v7/internal/view/menu/g;Landroid/view/MenuItem$OnMenuItemClickListener;)V

    :goto_0
    invoke-interface {v0, v1}, Landroid/support/v4/b/a/b;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 208
    return-object p0

    .line 206
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1, p2}, Landroid/support/v4/b/a/b;->setShortcut(CC)Landroid/view/MenuItem;

    .line 126
    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setShowAsAction(I)V

    .line 219
    return-void
.end method

.method public setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 224
    return-object p0
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setTitle(I)Landroid/view/MenuItem;

    .line 76
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 70
    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 87
    return-object p0
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g;->d:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/b/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/b/a/b;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method
